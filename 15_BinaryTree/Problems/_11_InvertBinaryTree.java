public class _11_InvertBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }  

    public static Node invertTree(Node root) {
        if (root == null) {
            return null;
        }

        Node left = invertTree(root.left);
        Node right = invertTree(root.right);

        root.left = right;
        root.right = left;

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
        invertTree(tree);
        preOrder(tree);

    }    
}
