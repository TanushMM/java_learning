public class FloydWarshall {
    static final int INF = 999999;
    static final int n = 4;

    public static void floydWarshall(int[][] graph) {
        int[][] distance = new int[n][n];
        for(int i =0; i < n; i++) {
            for(int j =0; j < n; j++) {
                distance[i][j] = graph[i][j];
            }
        }

        for(int k =0; k < n; k++) { // Considering each node as an intermediate vertex 
            for(int i = 0; i < n; i++) { // jth and kth loop are used to find the distance between jth and kth node
                for(int j = 0; j < n; j++) {
                    if (distance[i][k] + distance[k][j] < distance[i][j]) {
                        distance[i][j] = distance[i][k] + distance[k][j];
                    }
                }
            }
        }

        print(distance);
    }

    public static void print(int[][] graph) {
        for(int[] i : graph) {
            for(int j : i) {
                if (j == INF) {
                    System.out.print("INF" + " ");
                } else {
                    System.out.print(" " + j + "  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int graph[][] = {
                        { 0, 5, INF, 10 },
                        { INF, 0, 3, INF },
                        { INF, INF, 0, 1 },
                        { INF, INF, INF, 0 }
                        };
        floydWarshall(graph);
    }
}
