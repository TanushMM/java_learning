public class _1_SameTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isSame(Node root, Node root2) {
        if (root == null && root2 == null) {
            return true;
        }
        if (root == null || root2 == null) {
            return false;
        }
        return (root.data == root2.data) && isSame(root.left, root2.left) && isSame(root.right, root2.right);
    }
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right = new Node(3);
        tree.right.right = new Node(6);

        Node tree2 = new Node(1);
        tree2.left = new Node(2);
        tree2.left.left = new Node(4);
        tree2.left.right = new Node(5);
        tree2.right = new Node(3);
        tree2.right.right = new Node(6);

        System.out.println(isSame(tree, tree2));
        
    }    
}
