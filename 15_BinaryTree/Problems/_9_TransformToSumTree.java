public class _9_TransformToSumTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }    

    public static int sumTree(Node root) {
        if (root == null) {
            return 0;
        }

        int left = sumTree(root.left);
        int right = sumTree(root.right);

        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = left + right + newLeft + newRight;
        return data;
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
        sumTree(tree);
        preOrder(tree);
    }
}
