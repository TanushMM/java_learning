public class _8_KthAncestorOfANode {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    
    public static int kthAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        
        int left = kthAncestor(root.left, n, k);
        int right = kthAncestor(root.right, n, k);

        if (left == -1 && right == -1) {
            return -1;
        } else if (right == -1) {
            int temp = left + 1;
            if (temp == k) {System.out.print(root.data);}
            return temp;
        } else {
            int temp = right + 1;
            if (temp == k) {System.out.print(root.data);}
            return temp;
        }
    }

    /*
     * after if (left == -1 && right == -1) {return -1}
     * in apna college they wrote the following instead of above
     *  int max = Math.max(left, right);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
     */

    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right = new Node(3);
        tree.right.right = new Node(6);

        kthAncestor(tree, 6, 2);
    }    
}
