import java.util.*;

public class Graph {
    static class Edge {
        int src;
        int dest;
        int weight;
        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
            this.weight = 0;
        }
        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    // Get Neighbours of all the nodes present in the graph
    public static void getNeighbours(ArrayList<Edge>[] graph) {
        for(int i =0; i < graph.length; i++) {
            ArrayList<Edge> list = graph[i];
            for(int j =0; j < list.size(); j++) {
                System.out.print(list.get(j).dest + " ");
            }
            System.out.println();
        }
    }

    // Get Neightbour of the node given as argument
    public static void getNeighboursSingle(ArrayList<Edge>[] graph, int node) {
        for(int i =0; i < graph[node].size(); i++) {
            System.out.print(graph[node].get(i).dest + " ");
        }
        System.out.println();
    }

    /* BFS - Immediate nodes must be explored first - using Queue
     * Any node can be taken as starting point
     * analogous to Level order traversal in tree
     */
    public static void bfs(ArrayList<Edge>[] graph, boolean[] visited, int node) { 
        // O(V + E) 
        // V or E whichever is higher controls the Time complexity

        Queue<Integer> q = new LinkedList<>();
        q.add(node); // adding the source node from the graph

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                visited[curr] = true;
                System.out.print(curr + " ");
                for(int i =0; i < graph[curr].size(); i++) {
                    q.add(graph[curr].get(i).dest);
                }
            }
        }
    }

    /*
     * Keep going to the first neighbour - using stack (implicit stack from recursion)
     */
    public static void dfs(ArrayList<Edge>[] graph, boolean[] visited, int node) {
        // O(V + E) 
        if (!visited[node]) {
            System.out.print(node + " ");
            visited[node] = true;
        }
        for(int i =0; i < graph[node].size(); i++) {
            if (!visited[graph[node].get(i).dest]) {
                dfs(graph, visited, graph[node].get(i).dest);
            }
        }
    }

    // find if path is found between source and destination using DFS
    public static boolean hasPath(ArrayList<Edge>[] graph, boolean[] visited, int s, int d) {
        // O(V + E) 
        if (s == d) {
            return true;
        }
        visited[s] = true;
        for(int i =0; i < graph[s].size(); i++) {
            if (!visited[graph[s].get(i).dest] && hasPath(graph, visited, graph[s].get(i).dest, d)) {
                return true;
            }
        }
        return false;
    }

    public static void allPath(ArrayList<Edge>[] graph, boolean[] visited, int s, int d, String path) {
        if (s == d) {
            System.out.println(path + Integer.toString(s));
            return;    
        }
        visited[s] = true;
        for(int i = 0; i < graph[s].size(); i++) {
            int curr = graph[s].get(i).dest;
            if (!visited[curr]) {
                allPath(graph, visited, curr, d, path + Integer.toString(s) + " -> ");
            }
        }
        visited[s] = false;
    } 

    public static void bfsConnectedComponent(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                bfs(graph, visited, i);
            }
        }
    }

    public static void dfsConnectedComponent(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for(int i =0; i < graph.length; i++) {
            if (!visited[i]) {
                dfs(graph, visited, i);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i =0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,5));
        
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4));

        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        
        graph[4].add(new Edge(4,2,2));

        V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph2 = new ArrayList[V];
        for(int i =0; i < V; i++) {
            graph2[i] = new ArrayList<>();
        }
        graph2[0].add(new Edge(0,1,1));
        graph2[0].add(new Edge(0,2,1));

        graph2[1].add(new Edge(1,0,1));
        graph2[1].add(new Edge(1,3,1));

        graph2[2].add(new Edge(2,0,1));
        graph2[2].add(new Edge(2,4,1));

        graph2[3].add(new Edge(3,1,1));
        graph2[3].add(new Edge(3,4,1));
        graph2[3].add(new Edge(3,5,1));

        graph2[4].add(new Edge(4,2,1));
        graph2[4].add(new Edge(4,3,1));
        graph2[4].add(new Edge(4,5,1));

        graph2[5].add(new Edge(5,3,1));
        graph2[5].add(new Edge(5,4,1));
        graph2[5].add(new Edge(5,6,1));

        graph2[6].add(new Edge(6,5,1));
        
        


        // getNeighbours(graph);
        // getNeighboursSingle(graph, 1);

        boolean[] visited = new boolean[V];
        // bfs(graph, visited, 0);
        // Arrays.fill(visited, false);

        // dfs(graph, visited, 0);
        // Arrays.fill(visited, false);

        // System.out.println(hasPath(graph2, visited, 0, 7));
        // Arrays.fill(visited, false);

        // bfsConnectedComponent(graph);
        // Arrays.fill(visited, false);

        // dfsConnectedComponent(graph);
        // Arrays.fill(visited, false);

        allPath(graph2, visited, 0, 5, "");
        
    }    
}
