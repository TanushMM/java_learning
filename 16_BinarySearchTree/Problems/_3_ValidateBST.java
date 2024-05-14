import java.util.*;

public class _3_ValidateBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
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

    public static void inOrder(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }
    public static boolean validateBSTMyApproach(Node root) {
        if (root == null) {
            return true;
        }
        List<Integer> list = new ArrayList<>(); 
        inOrder(root, list);

        for(int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i-1)) {
                return false;
            }
        }

        return true;
    }

    public static boolean validateBSTApnaCollege(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }

        return  validateBSTApnaCollege(root.left, min, root) && 
                validateBSTApnaCollege(root.right, root, max);
    }
    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root = null;

        for(int i : values) {
            root = insert(root, i);
        }

        System.out.println(validateBSTMyApproach(root));
        
        System.err.println(validateBSTApnaCollege(root, null, null));
    }
}
