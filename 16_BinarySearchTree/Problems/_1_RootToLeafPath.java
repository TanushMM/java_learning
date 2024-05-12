import java.util.ArrayList;
import java.util.List;

public class _1_RootToLeafPath {
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

    public static void printAllPath(Node root, List<Integer> list, List<List<Integer>> answer) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            list.add(root.data);
            answer.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        list.add(root.data);
        printAllPath(root.left, list, answer);
        printAllPath(root.right, list, answer);
        list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root = null;

        for(int i : values) {
            root = insert(root, i);
        }

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();

        printAllPath(root, list, answer);
        System.out.println(answer);
    }
}