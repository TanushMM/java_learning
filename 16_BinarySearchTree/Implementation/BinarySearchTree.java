public class BinarySearchTree {
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

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int key) {
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // deleting leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // delete node with one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // deleting node with two child
            Node inorderSuccessor = findInorderSuccessor(root.right);
            root.data = inorderSuccessor.data;
            root.right = delete(root.right, inorderSuccessor.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static int rangeSum(Node root, int min, int max) {
        if (root == null) {
            return 0;
        }
        int left = rangeSum(root.left, min, max);
        int right = rangeSum(root.right, min, max);

        if (root.data >= min && root.data <= max) {
            return left + right + root.data;
        }
        return left + right;
    }

    public static void rangePrint(Node root, int min, int max) {
        if (root == null) {return;}
        rangePrint(root.left, min, max);
        if (root.data >= min && root.data <= max) {
            System.out.print(root.data + " ");
        }
        rangePrint(root.right, min, max);
    }

    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root = null;

        for(int i : values) {
            root = insert(root, i);
        }

        inOrder(root);
        System.out.println();

        System.out.println(search(root, 10));

        System.out.println(rangeSum(root, 3,5));

        rangePrint(root, 3, 5);
    }    
}
