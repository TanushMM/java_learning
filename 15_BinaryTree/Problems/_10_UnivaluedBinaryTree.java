public class _10_UnivaluedBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    } 

    public static boolean univaluedBinaryTree(Node root, int prev) {
        if (root == null) {
            return true;
        }
        if (root.data != prev) {
            return false;
        }

        boolean left = univaluedBinaryTree(root.left, root.data);
        boolean right = univaluedBinaryTree(root.right, root.data);

        return left && right;
    }
    
    public static void main(String[] args) {
        Node tree = new Node(2);
        tree.left = new Node(2);
        tree.left.left = new Node(2);
        tree.left.right = new Node(1);
        tree.right = new Node(2);
        tree.right.right = new Node(2);

        System.out.println(univaluedBinaryTree(tree, tree.data));
    }
}
