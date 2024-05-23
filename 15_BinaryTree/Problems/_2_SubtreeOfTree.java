public class _2_SubtreeOfTree {
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

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isSame(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right = new Node(3);
        tree.right.right = new Node(6);

        Node tree2 = new Node(2);
        tree2.left = new Node(4);
        tree2.right = new Node(5);

        System.out.println(isSubtree(tree, tree2));
        
    }   
}
