public class _0_HeightSumCount {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int height(Node root) {
        /*
         * height of tree with respect to number of nodes and not edges
         */
        if (root == null) {
            return 0;
        }
        /*
         * int leftHeight = height(root.left);
         * int rightHeight = height(root.right);
         */
        return Math.max(height(root.left) , height(root.right)) + 1;
    }

    public static int count(Node root) {
        /*
         * Count of nodes
         */
        if (root == null) {
            return 0;
        }
        return count(root.left) + count(root.right) + 1;
    }

    public static int sumOfNodes(Node root) {
        /*
         * Sum of all the nodes present in the binary tree
         */
        if (root == null) {
            return 0;
        }
        return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
    }

    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right = new Node(3);
        tree.right.right = new Node(6);
        
        System.out.println(height(tree));
        System.out.println(count(tree));
        System.out.println(sumOfNodes(tree));
    } 
}
