public class DisjointSet {
    static int n = 7;
    static int[] parent = new int[n];
    static int[] rank = new int[n];

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
        int parentX = find(x);
        int parentY = find(y);

        if (rank[parentX] == rank[parentY]) {
            parent[parentY] = parentX;
            rank[parentX]++;
        } else if (rank[parentX] < rank[parentY]) {
            parent[parentX] = parentY;
        } else if (rank[parentY] < rank[parentX]) {
            parent[parentY] = parentX;
        }
    }

    public static void main(String[] args) {
        init();

        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);

    }
}
