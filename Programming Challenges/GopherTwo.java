import java.util.*;
//NOT DONE
public class GopherTwo {

    static Vector<Vector<Integer>> adjList = new Vector<>();
    static boolean[] visited;
    static int[] match;

    private static int Aug(int left) {
        if (visited[left])
            return 0;
        visited[left] = true;

        Iterator it = adjList.get(left).iterator();
        while (it.hasNext()) {
            Integer right = (Integer) it.next();
            if (match[right] == -1 || Aug(match[right]) == 1) {
                match[right] = left;
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        while (keyboard.hasNext()) {

            int numGlophers = keyboard.nextInt(), numHoles = keyboard.nextInt(), timeToHole = keyboard.nextInt(),
                    golpSpeed = keyboard.nextInt();
            double[] glopherX = new double[numGlophers], glopherY = new double[numGlophers],
                    holeX = new double[numHoles], holeY = new double[numHoles];
            int V = numGlophers + numHoles, V_l = numGlophers; // V: total vertex, V_l: vertex on left side
            int maxDistance = golpSpeed * timeToHole * golpSpeed * timeToHole;

            for (int i = 0; i < numGlophers; i++) {
                glopherX[i] = keyboard.nextDouble();
                glopherY[i] = keyboard.nextDouble();
            }

            for (int i = 0; i < numHoles; i++) {
                holeX[i] = keyboard.nextDouble();
                holeY[i] = keyboard.nextDouble();
            }

            for (int i = 0; i < V; i++)
                adjList.add(new Vector<>());

            for (int i = 0; i < numGlophers; i++) {
                for (int j = 0; j < numHoles; j++) {
                    double golfDistance = Math.pow(holeX[j] - glopherX[i], 2) + Math.pow(holeY[j] - glopherY[i], 2);
                    if (golfDistance <= maxDistance)
                        adjList.get(i).add(j + numGlophers);
                }
            }

            int MCBM = 0;
            match = new int[V];
            Arrays.fill(match, -1);
            for (int i = 0; i < V_l; i++) {
                visited = new boolean[V_l];
                MCBM += Aug(i);
            }
            System.out.println(numGlophers - MCBM);
        }
    }
}
