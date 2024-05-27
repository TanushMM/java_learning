import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class _4_TopViewOfATree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    static class Info {
        Node node;
        int horizontalDistance;
        Info(Node node, int hd) {
            this.node = node;
            this.horizontalDistance = hd;
        }
    }

    public static void topViewOfATree(Node root) {
        if (root == null) {
            return;
        }

        int minmumHorizontalDistance = Integer.MAX_VALUE;
        int maximumHorizontalDistance = Integer.MIN_VALUE;

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                // do operations in hashtable
                if (!map.containsKey(curr.horizontalDistance)) {
                    map.put(curr.horizontalDistance, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.horizontalDistance - 1));
                    minmumHorizontalDistance = Math.min(minmumHorizontalDistance, curr.horizontalDistance - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.horizontalDistance + 1));
                    maximumHorizontalDistance = Math.max(maximumHorizontalDistance, curr.horizontalDistance + 1);
                }
            }
        }

        for(int i = minmumHorizontalDistance; i <= maximumHorizontalDistance; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right = new Node(3);
        tree.right.right = new Node(6);

        System.out.println("Top view of a tree: ");
        topViewOfATree(tree);
    }    
}
