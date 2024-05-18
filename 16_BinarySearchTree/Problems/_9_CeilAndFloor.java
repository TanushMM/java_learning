public class _9_CeilAndFloor {
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

    public static int ceil(Node root, int key) {
        int ceil = -1;
        while (root != null) {
            if (root.data == key) {
                ceil = root.data;
                return ceil;
            }
            if (key > root.data) {
                root = root.right;
            } else {
                ceil = root.data;
                root = root.left;
            }
        }
        return ceil;
    }

    public static int floor(Node root, int key) {
        int floor = -1;
        while(root != null) {
            if (root.data == key) {
                floor = root.data;
                return floor;
            }
            if (key > root.data) {
                floor = root.data;
                root = root.right;
            } else {
                root = root.left;
            }
        }

        return floor;
    }

    public static void main(String[] args) {
        int[] values = {1,2,3,4,5,7};
        Node root = null;

        for(int i : values) {
            root = insert(root, i);
        }

        System.out.println(ceil(root, 6));
        System.out.println(floor(root, 6));
    }
}
