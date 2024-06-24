import java.util.*;

public class _13_DiagonalTraversal {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    public static List<Integer> diagonal(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        } 

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.remove();

            while (curr != null) {
                if (curr.left != null) {
                    q.add(curr.left);
                }
                list.add(curr.data);
                curr = curr.right;
            }
        }

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

        diagonal(tree);

    }
}
