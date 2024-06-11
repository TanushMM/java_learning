public class _12_DeleteLeafWithValueAsX {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }  

    public static Node deleteLeafWithX(Node root, int target) {
        if (root == null) {
            return null;
        }
        root.left = deleteLeafWithX(root.left, target);
        root.right = deleteLeafWithX(root.right, target);

        if (root.data == target && root.left == null && root.right == null) {
            return null;
        }
        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right = new Node(3);
        tree.right.right = new Node(6);

        preOrder(tree);
        System.out.println();
        deleteLeafWithX(tree, 4);
        preOrder(tree);

    }
}
