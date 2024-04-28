import java.util.*;

public class KosarajuSCC {
    /*
     * SCC is a component in which we can reach every vertex of the component from every
     * other vertex in that component.
     * 
     * Only in directed graph
     * 
     * for finding SCC, we must do DFS in reverse 
     * to Do DFS in reverse we use Kosaraju's algorithm
     */
    /*
     * 1 -> Do topological sort on the graph and store the stack for further use
     * 2 -> Transpose the graph (if s->d then create another graph where d->s) (reverse the edge)
     * 3 -> do DFS according to the nodes from the stack on the transposed matrix
     */
    static class Edge {
        int src;
        int dest;
        int wht;

        Edge(int s, int d) {
            src = s;
            dest = d;
            wht = 1;
        }
    }
    public static void topologicalSortDFS(ArrayList<Edge>[] graph, Stack<Integer> stack, boolean[] visited, int source) {
        if (!visited[source]) {
            visited[source] = true;

            for(int i =0; i < graph[source].size(); i++) {
                Edge e = graph[source].get(i);
                topologicalSortDFS(graph, stack, visited, e.dest);
            }
            stack.push(source);
        }
    }
    public static void transposeGraph(ArrayList<Edge>[] graph, ArrayList<Edge>[] transpose) {
        for(int i =0; i < graph.length; i++) {
            for(int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }
    }
    public static void dfs(ArrayList<Edge>[] graph, boolean[] visited, int source) {
        if (!visited[source]) {
            visited[source] = true;
            System.out.print(source + " ");
            for(int i =0; i < graph[source].size(); i++) {
                dfs(graph, visited, graph[source].get(i).dest);
            }
        }
    }
    public static void kosaraju(ArrayList<Edge>[] graph, int source) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        topologicalSortDFS(graph, stack, visited, source);

        @SuppressWarnings("unchecked")
        ArrayList<Edge> transpose[] = new ArrayList[5];

        for (int i = 0; i < graph.length; i++) {
            transpose[i] = new ArrayList<>();
        }
        
        transposeGraph(graph, transpose);
        visited = new boolean[graph.length]; // resetting the visited array
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (!visited[curr]) {
                dfs(transpose, visited, curr);
                System.out.println();
            }
        }
        
    }
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[5];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));

        kosaraju(graph, 0);
    }
}
