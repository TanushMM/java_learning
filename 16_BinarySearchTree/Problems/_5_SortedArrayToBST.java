public class _5_SortedArrayToBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    public static Node arrayToBST(int[] array, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + ((end-start)/2);
        Node root = new Node(array[mid]);
        root.left = arrayToBST(array, start, mid - 1);
        root.right = arrayToBST(array, mid + 1, end);

        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int[] array = {3,5,6,8,10,11,12};
        Node root = arrayToBST(array, 0, array.length-1);

        inOrder(root);
    }
}
