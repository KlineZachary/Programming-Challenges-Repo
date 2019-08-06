//NOT DONE ALGORITHM NEEDS TO BE ALTERED ONLY WORKS FOR 
//first test case

// import java.util.*;
// import java.io.*;

// public class Freckles {
//     public static void main(String[] args) {
//         Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//         int cases = keyboard.nextInt();

//         for (int i = 0; i < cases; i++) {
//             int lines = keyboard.nextInt();
//             ArrayList<Vertex> list = new ArrayList<>();

//             for (int j = 0; j < lines; j++)
//                 list.add(new Vertex(j, keyboard.nextDouble(), keyboard.nextDouble()));
//             for (int j = 0; j < lines; j++)
//                 for (int k = j + 1; k < lines; k++) {
//                     list.get(j).adj.add(new Edge(list.get(j), list.get(k)));
//                     list.get(k).adj.add(new Edge(list.get(k), list.get(j)));
//                 }

//             mst(list);
//             System.out.printf("%.2f\n", mstWeight);
//             if (i != cases - 1)
//                 System.out.println();
//         }
//     }

//     static double mstWeight;

//     // took a graph and return the MST, or don't return anything if just need the
//     // min cost
//     public static void mst(List<Vertex> vertices) {
//         mstWeight = 0.0;
//         boolean[] visited = new boolean[vertices.size()];
//         visited[0] = true;
//         PriorityQueue<Edge> pq = new PriorityQueue<>();
//         for (Edge e : vertices.get(0).adj)
//             pq.offer(e);
//         while (!pq.isEmpty()) {
//             Edge u = pq.poll();
//             if (!visited[u.target.id]) {
//                 mstWeight += Math.sqrt(u.weight);
//                 visited[u.target.id] = true;
//                 for (Edge e : u.target.adj) {
//                     if (!visited[e.target.id])
//                         pq.offer(e);
//                 }
//             }
//         }
//     }
// }

// // Prim's
// class Vertex {
//     int id;
//     double x, y;
//     List<Edge> adj = new ArrayList<>();

//     Vertex(int a, double x, double y) {
//         id = a;
//         this.x = x;
//         this.y = y;
//     }
// }

// class Edge implements Comparable<Edge> {
//     double weight;
//     Vertex target;
//     Vertex src;

//     Edge(Vertex s, Vertex t) {
//         target = t;
//         src = s;
//         weight = distance();
//     }

//     public int compareTo(Edge e) {
//         return Double.compare(weight, e.weight);
//     }

//     public double distance() {
//         return (src.x - target.x) * (src.x - target.x) + (src.y - target.y) * (src.y - target.y);
//     }
// }

// // this class is to store the edges in MST
// // if only need the MST weight, then ignore this
// class IntPair {
//     int v1, v2;

//     IntPair(int a, int b) {
//         v1 = a;
//         v2 = b;
//     }
// }
