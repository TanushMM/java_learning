import java.util.ArrayList;

public class _6_LowestCommonAncestor {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static boolean getPath(Node root, int n, ArrayList<Node> list) {
        if (root == null) {
            return false;
        }
        list.add(root);
        if (root.data == n) {
            return true;
        }
        boolean left =  getPath(root.left, n, list);
        boolean right = getPath(root.right, n, list);
        if (left || right) {
            return true;
        }
        list.remove(list.size() - 1);
        return false;
    }
    public static void lowestCommonAncestor(Node root, int n1, int n2) {
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();

        getPath(root, n1, list1);
        getPath(root, n2, list2);

        int i =0;
        for(;i < list1.size() && i < list2.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                break;
            }
        }

        Node lca = list1.get(i - 1);
        System.out.println("Lowest Common Ancestor: " + lca.data);
    }

    public static Node lca(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }
        return root;
    }
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right = new Node(3);
        tree.right.right = new Node(6);

        lowestCommonAncestor(tree, 4, 5);
        System.out.println("Approach 2: " + lca(tree, 4, 5).data);
    }
}