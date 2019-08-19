import java.util.*;
import java.io.*;

public class Grid {
    static class Node {
        int id;
        int value;
        int steps = 0;
        List<Node> adjacent = new ArrayList<>();

        Node(int id, int value) {
            this.id = id;
            this.value = value;
        }
    }

    static boolean[] visited;
    static int N;

    /*
     * GO FROM (x,y) -> i i = x + y*width
     * 
     * GO FROM i -> (x,y) x = i % width y = i / width
     * 
     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = keyboard.nextInt(), W = keyboard.nextInt();
        N = H * W; // 4 nodes;
        List<List<Node>> nodes = new ArrayList<>();
        int[][] directions = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        int index = 0;

        for (int y = 0; y < H; y++) {
            String line = keyboard.next();
            List<Node> currentRow = new ArrayList<>();

            for (int x = 0; x < W; x++) {
                int value = line.charAt(x) - '0';
                Node newNode = new Node(index++, value);
                currentRow.add(newNode);
            }
            nodes.add(currentRow);
        }

        index = 0;

        // Height
        for (int y = 0; y < H; y++) {
            List<Node> currentRow = nodes.get(y);

            // Width
            for (int x = 0; x < W; x++) {
                Node currentNode = currentRow.get(x);
                int length = currentNode.value;// length of direction

                // Direction
                for (int i = 0; i < 4; i++) {
                    int dx = (directions[i][0]) * length;
                    int dy = directions[i][1] * length;
                    int new_x = x + dx;
                    int new_y = y + dy;
                    if (new_x >= 0 && new_x < W && new_y >= 0 && new_y < H) {// Check if next node is on grid
                        Node nextNode = nodes.get(new_y).get(new_x);
                        currentNode.adjacent.add(nextNode);
                    }
                }
            }
        }
        visited = new boolean[N];
        System.out.println(bfs(nodes.get(0).get(0)));

    }

    public static int bfs(Node n) {
        visited[n.id] = true;
        Queue<Node> q = new LinkedList<>();
        q.add(n);
        while (!q.isEmpty()) {
            Node u = q.poll();
            if (u.id == N - 1) {
                return u.steps;
            }
            for (Node adj : u.adjacent) {
                if (!visited[adj.id]) {
                    adj.steps = u.steps + 1;
                    q.add(adj);
                    visited[adj.id] = true;
                }
            }
        }
        return -1;
    }

}