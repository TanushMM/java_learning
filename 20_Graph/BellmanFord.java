import java.util.*;

public class BellmanFord {
    /*
     * Shortest path from source to all vertices (negative edges)
     * this is a DP problem in graph
     * this can handle negative weights
     * doesn't work for negative weight cycles (the entire cycle must sum up to a negative value) -> the cycle's weight will get 
     * calculated infinetly because on each cycle calculation the weight would reduce more and more because of 
     * negative weight which can lead to infinite loop
     */
    static class Edge {
        int src;
        int dest;
        int weight;
        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    // O(V * E)
    public static void bellmanFordAdjacencyList(ArrayList<Edge>[] graph, int source) {
        int[] distance = new int[graph.length];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        /*
        * We have to run the relaxation step (total node - 1) times 
        */
        // Algorithm - O(V)
        for(int i =0; i < graph.length - 1; i++) {
            // Edges - O(E)
            for(int node = 0; node < graph.length; node++) {
                for(int j = 0; j < graph[node].size(); j++) {
                    Edge e = graph[node].get(j);
                    int u = e.src;
                    int v = e.dest;
                    int w = e.weight;
                    
                    // In java if a +ve number is added to infinity(MAX_VALUE) it can return a negative value
                    // this can lead to error that is why we check it in the below condition
                    if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v]) { // Relaxation step
                        distance[v] = distance[u] + w;
                    }
                }
            }
        }

        for(int i = 0; i < distance.length; i++) {
            System.out.println(i + " " + distance[i]);
        }
    }

    public static void bellManFordEdgeList(ArrayList<Edge> edgeList, int source, int V) {
        int[] distance = new int[V];
        distance[source] = 0;

        for(int i = 0; i < edgeList.size() - 1; i++) {
            for(int node = 0; node < edgeList.size(); node++) {
                Edge e = edgeList.get(node);
                int u = e.src;
                int v = e.dest;
                int w = e.weight;

                // In java if a +ve number is added to infinity(MAX_VALUE) it can return a negative value
                // this can lead to error that is why we check it in the below condition
                if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v]) { // Relaxation step
                    distance[v] = distance[u] + w;
                }
            }
        }

        for(int i = 0; i < distance.length; i++) {
            System.out.println(i + " " + distance[i]);
        }
    }

    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

        System.out.println("Adjacency list: ");
        bellmanFordAdjacencyList(graph, 0);


        ArrayList<Edge> edgeList = new ArrayList<>();
        edgeList.add(new Edge(0,1,2));
        edgeList.add(new Edge(0,2,4));
        edgeList.add(new Edge(1,2,-4));
        edgeList.add(new Edge(2,3,2));
        edgeList.add(new Edge(3,4,4));
        edgeList.add(new Edge(4,1,-1));

        System.out.println("Edge List: ");
        bellManFordEdgeList(edgeList, 0, V);
    }
}
