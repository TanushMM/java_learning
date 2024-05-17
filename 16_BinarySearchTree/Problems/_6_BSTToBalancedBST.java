import java.util.*;

public class _6_BSTToBalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void inOrderGenerator(Node root, List<Integer> inOrder) {
        if (root == null) {
            return;
        }
        inOrderGenerator(root.left, inOrder);
        inOrder.add(root.data);
        inOrderGenerator(root.right, inOrder);

    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static Node bstToBalancedBST(List<Integer> inOrder, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + ((end-start)/2);
        Node root = new Node(inOrder.get(mid));
        root.left = bstToBalancedBST(inOrder, start, mid-1);
        root.right = bstToBalancedBST(inOrder, mid+1, end);
        return root;
    }

    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root = null;

        for(int i : values) {
            root = insert(root, i);
        }
        
        List<Integer> inOrder = new ArrayList<>();
        inOrderGenerator(root, inOrder);
        root = bstToBalancedBST(inOrder, 0, inOrder.size()-1);
        
        inOrder(root);
    }
}
