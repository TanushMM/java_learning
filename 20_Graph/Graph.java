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
        // check if the following line of code should be present or not
        // visited[s] = false;
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

    // O(V + E)
    public static boolean detectCycleDfsUndirected(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for(int i =0; i < graph.length; i++) {
            if (!visited[i]) {
                if (detectCycleDfsUtilUndirected(graph, visited, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean detectCycleDfsUtilUndirected(ArrayList<Edge>[] graph, boolean[] visited, int current, int parent) {
        visited[current] = true;
        for(int i =0; i < graph[current].size(); i++) {
            int e = graph[current].get(i).dest;
            if (!visited[e]) {
                if (detectCycleDfsUtilUndirected(graph, visited, e, current)) {
                    return true;
                }
            } else if (visited[e] && e != parent) {
                return true;
            }
            // Case 2:
            // (visited[e.dest] && e.dest == parent) --------> do nothing
        }

        // visited[current] = false;
        /*
         * This above backtracking step is not required if cycle is present then the function would terminate 
         * else if cycle is not found, then there is not chance that a node that is visited is going to 
         * get visited again, hence this step is not required. This is the case of undirected graph.
         * 
         * more enhanced version is found in detectCycleDfsDirected where we use visitedBackTracking to track the 
         * visited nodes and visitedMain to be used for main visited tracking.
         */
        return false;
    }

    // O(V + E)
    public static boolean detectCycleDfsDirected(ArrayList<Edge>[] graph) {
        boolean[] visitedMain = new boolean[graph.length];
        boolean[] visitedBackTracking = new boolean[graph.length];
        for(int i =0; i < graph.length; i++) {
            if (!visitedMain[i]) {
                if (detectCycleDfsUtilDirected(graph, visitedMain, visitedBackTracking, i)) {
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean detectCycleDfsUtilDirected(ArrayList<Edge>[] graph, boolean[] visitedMain, boolean[] visitedBackTracking, int current) {
        visitedMain[current] = true;
        visitedBackTracking[current] = true;
        for(int i =0; i < graph[current].size(); i++) {
            int e = graph[current].get(i).dest;
            if (visitedBackTracking[e]) {
                return true;
            } else if (!visitedMain[e] && detectCycleDfsUtilDirected(graph, visitedMain, visitedBackTracking, e)) {
                return true;
            }
        }
        visitedBackTracking[current] = false;
        return false;
    }

    public static void topologicalSortDfs(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for(int i =0 ; i < graph.length; i++) {
            if (!visited[i]) {
                topologicalSortDfsUtil(graph, visited, stack, i);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    private static void topologicalSortDfsUtil(ArrayList<Edge>[] graph, boolean[] visited, Stack<Integer> stack, int current) {
        visited[current] = true;
        for(int i =0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (!visited[e.dest]) {
                topologicalSortDfsUtil(graph, visited, stack, e.dest);
            }
        }
        stack.push(current);
    }

    public static void topologicalSortBfs(ArrayList<Edge>[] graph) { 
        int[] inDegree = new int[graph.length];
        inDegreeCalculator(graph, inDegree);
        Queue<Integer> q = new LinkedList<>();

        // In DAG, there will always be one vertex with 0 in-degree and one with 0 out-degree 
        // and we want to add the vertex with 0 in-degree as the starting point of the topological sort

        for(int i =0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        // Logic of topological sort (BFS) using Khan's algorithm
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i =0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                inDegree[e.dest]--;
                if (inDegree[e.dest] == 0) { 
                    // we add the elements with indegree -> 0
                    // it means thats there is no nodes that comes before
                    // hence we have to procedd with the vertex that has a in-degree of 0
                    q.add(e.dest);
                }
            }
        }

    }
    public static void inDegreeCalculator(ArrayList<Edge>[] graph, int[] inDegree) {
        for(int i =0; i < graph.length; i++) {
            ArrayList<Edge> list = graph[i];
            for(int j = 0; j < list.size(); j++) {
                inDegree[list.get(j).dest]++;
            }
        }
    }

    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] topGraph = new ArrayList[V];
        for(int i =0; i < V; i++) {
            topGraph[i] = new ArrayList<>();
        }
        topGraph[0].add(new Edge(0,1,1));
        topGraph[0].add(new Edge(0,2,1));

        topGraph[1].add(new Edge(1,3,1));

        topGraph[2].add(new Edge(2,3,1));



        V = 5;
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


        V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph2 = new ArrayList[V];
        for(int i =0; i < V; i++) {
            graph2[i] = new ArrayList<>();
        }

        graph2[0].add(new Edge(0,1,1));
        graph2[0].add(new Edge(0,2,1));
        graph2[0].add(new Edge(0,3,1));

        graph2[1].add(new Edge(1,0,1));
        graph2[1].add(new Edge(1,2,1));

        graph2[2].add(new Edge(2,0,1));
        graph2[2].add(new Edge(2,1,1));

        graph2[3].add(new Edge(3,0,1));
        graph2[3].add(new Edge(3,4,1));

        graph2[4].add(new Edge(4,3,1));


        V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph3 = new ArrayList[V];
        for(int i =0; i < V; i++) {
            graph3[i] = new ArrayList<>();
        }
        graph3[0].add(new Edge(0,1,1));
        graph3[0].add(new Edge(0,2,1));

        graph3[1].add(new Edge(1,0,1));
        graph3[1].add(new Edge(1,3,1));

        graph3[2].add(new Edge(2,0,1));
        graph3[2].add(new Edge(2,4,1));

        graph3[3].add(new Edge(3,1,1));
        graph3[3].add(new Edge(3,4,1));
        graph3[3].add(new Edge(3,5,1));

        graph3[4].add(new Edge(4,2,1));
        graph3[4].add(new Edge(4,3,1));
        graph3[4].add(new Edge(4,5,1));

        graph3[5].add(new Edge(5,3,1));
        graph3[5].add(new Edge(5,4,1));
        graph3[5].add(new Edge(5,6,1));

        graph3[6].add(new Edge(6,5,1));

        
        


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

        // allPath(graph2, visited, 0, 5, "");

        // System.out.println(detectCycleDfsUndirected(graph2));
        // System.out.println(detectCycleDfsDirected(graph2));

        topologicalSortDfs(topGraph);
        topologicalSortBfs(topGraph);
        
    }    
}
