public class _2_PrintInRange {
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

    public static void printRangeApnaCollege(Node root, int min, int max) { // inclusive range
        if (root == null) {
            return;
        }
        if (root.data >= min && root.data <= max) {
            printRangeApnaCollege(root.left, min, max);
            System.out.print(root.data + " ");
            printRangeApnaCollege(root.right, min, max);
        } else if (root.data < min) {
            printRangeApnaCollege(root.right, min, max);
        } else {
            printRangeApnaCollege(root.left, min, max);
        }
    }

    public static void printRange(Node root, int min, int max) {
        if (root == null) {
            return;
        }
        printRange(root.left, min, max);
        if (root.data >= min && root.data <= max) {
            System.out.print(root.data + " ");
        }
        printRange(root.right, min, max);
    }

    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root = null;

        for(int i : values) {
            root = insert(root, i);
        }

        printRangeApnaCollege(root, 4, 7);
        System.out.println();
        printRange(root, 4, 7);
    }
}
