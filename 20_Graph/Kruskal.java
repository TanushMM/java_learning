import java.util.*;

public class Kruskal {
    static class Edge implements Comparable<Edge> {
        int s, d, w;
        Edge(int s, int d, int w) {
            this.s = s;
            this.d = d;
            this.w = w;
        }
        @Override
        public int compareTo(Edge that) {
            return this.w - that.w;
        }
    }
    static int n = 4;
    static int[] parent = new int[n];
    static int[] rank = new int[4];
    public static void init() {
        for(int i =0; i < n; i++) {
            parent[i] = i;
        }
    }

    public static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }
    public static void union(int x, int y) {
        int pX = find(x);
        int pY = find(y);

        if (rank[pX] == rank[pY]) {
            parent[pX] = pY;
            rank[pY]++;
        } else if (rank[pX] < rank[pY]) {
            parent[pX] = pY;
        } else if (rank[pY] < rank[pX]) {
            parent[pY] = pX;
        }
    }

    public static void kruksal(ArrayList<Edge> edgeList) {
        init();
        Collections.sort(edgeList);

        int weightMST = 0;
        int count = 0;

        for(int i =0; count < n-1; i++) {
            Edge e = edgeList.get(i);
            int s = e.s; int d = e.d; int w = e.w;

            int parentSource = find(s);
            int parentDestination = find(d);

            if (parentSource != parentDestination) { // If it is equal then it shows cycle in graph which we do not need in MST
                union(parentSource, parentDestination);
                weightMST += w;
                count++;
            }
        }

        System.out.println("Wight of MST using Kruksal's algorithm: " + weightMST);
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph = new ArrayList<>();

        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0, 2, 15));
        graph.add(new Edge(0, 3, 30));

        graph.add(new Edge(1, 3, 40));

        graph.add(new Edge(2, 3, 50));

        kruksal(graph);
    }
}
