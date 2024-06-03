public class _7_MinimumDistanceBetweenTwoNodes {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node lca(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        return root;
    }

    public static int lcaPath(Node root, int n) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int left = lcaPath(root.left, n);
        int right = lcaPath(root.right, n);

        if (left == -1 && right == -1) {
            return -1;
        } else if (left == -1) {
            return right + 1;
        } else {
            return left + 1;
        }
    }

    public static int minimumDistance(Node root, int n1, int n2) {
        Node ancestor = lca(root, n1, n2);
        int left = lcaPath(ancestor, n1);
        int right = lcaPath(ancestor, n2);

        return left + right;
    }

    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right = new Node(3);
        tree.right.right = new Node(6);

        System.out.println(minimumDistance(tree, 4, 6));
    }
}
