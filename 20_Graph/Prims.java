import java.util.*;

public class Prims {
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
    static class Pair implements Comparable<Pair> {
        int node;
        int weight;
        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }

        @Override
        public int compareTo(Pair that) {
            return this.weight - that.weight;
        } 
    }

    public static void prims(ArrayList<Edge>[] graph, int source) {
        boolean[] visited = new boolean[graph.length];
        int cost = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(source, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!visited[curr.node]) {
                visited[curr.node] = true;
                cost += curr.weight;

                for(int i =0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    pq.add(new Pair(e.dest, e.weight));
                }
            }
        }

        System.out.println("Min cost of MST: " + cost);
    }

    public static void main(String[] args) {
        int V = 4;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

        prims(graph, 0);
    }
}
