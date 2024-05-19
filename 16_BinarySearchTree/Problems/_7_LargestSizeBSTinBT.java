public class _7_LargestSizeBSTinBT {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    
    static class Info {
        boolean isBst;
        int size;
        int min;
        int max;
        Info(boolean isBst, int size, int min, int max) {
            this.isBst = isBst;
            this.size = size;
            this.min =min;
            this.max = max;
        }
    }

    public static Info LargestSizeBSTinBT(Node root) {
        
    }

    public static void main(String[] args) {
        
    }
}
