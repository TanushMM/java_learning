public class _3_DiameterOfBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int diameter = 0;

    public static int diameter(Node root) {
        /*
         * diameter with respect to edges and not the nodes itself
         * if we want the diameter with respect to the number of nodes
         * update the following 
         * diameter = Math.max(diameter, leftHeight + rightHeight + 1);
         */
        if (root == null) {
            return 0;
        }
        int leftHeight = diameter(root.left);
        int rightHeight = diameter(root.right);
        diameter = Math.max(diameter, leftHeight + rightHeight);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right = new Node(3);
        tree.right.right = new Node(6);

        diameter(tree);
        System.out.println(diameter);
        
    }        
}
