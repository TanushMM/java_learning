import java.util.*;

public class Dijkstra {
    /*
     * Shortest path from source to all vertices (weighted graph)
     * this is a greedy algorithm in graph
     * It cannot guarantee correct answer if we have negative weights 
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
    static class Pair implements Comparable<Pair>{
        int node;
        int path;
        Pair(int node, int path) {
            this.node = node;
            this.path = path;
        }

        @Override
        public int compareTo(Pair that) {
            return this.path - that.path;
        }
    }

    // O(V + E Log V)
    public static void dijkistra(ArrayList<Edge>[] graph, int source) {
        int[] distance = new int[graph.length];
        boolean[] visited = new boolean[graph.length];

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(source, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.remove();
            if (!visited[current.node]) {
                visited[current.node] = true;
                for(int i = 0 ; i < graph[current.node].size(); i++) {
                    Edge e = graph[current.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int w = e.weight;
                    
                    // In java if a +ve number is added to infinity(MAX_VALUE) it can return a negative value
                    // this can lead to error that is why we check it in the below condition
                    if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v]) { // Relaxation step
                        distance[v] = distance[u] + w;
                        pq.offer(new Pair(v, distance[v]));
                    }
                }
            }
        }

        for(int i =0; i < distance.length; i++) {
            System.out.println(i + " " + distance[i]);
        }
    }

    public static void main(String[] args) {
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i =0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

        dijkistra(graph, 0);
    }
}
