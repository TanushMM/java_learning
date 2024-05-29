class _5_KthLevel {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static void kthLevel(Node root, int k, int level) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kthLevel(root.left, k, level + 1);
        kthLevel(root.right, k, level + 1);
    }
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right = new Node(3);
        tree.right.right = new Node(6);

        System.out.println("Kth Level: ");
        kthLevel(tree, 3, 1);
    }    
}
