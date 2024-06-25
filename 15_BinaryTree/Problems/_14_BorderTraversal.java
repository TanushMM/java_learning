import java.util.*;

// Yet to complete

public class _14_BorderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    public static void leftBorder(Node root, List<Integer> list) {
        Node curr = root;
        while (curr != null) {
            if (curr.left == null && curr.right == null) {
                return;
            }
            list.add(curr.data);
            if (curr.left != null) {
                curr = curr.left;
            }
        }
    }

    public static void rightBorder(Node root, List<Integer> list) {
        
    }

    public static List<Integer> border(Node root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }

        // Queue<Node> q = new LinkedList<>();
        // q.add(root);

        leftBorder(root, list);

        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right = new Node(3);
        tree.right.right = new Node(6);

        border(tree);
    }
}
