public class TowerOfHanoi {
    public static void TOH(int n, int a, int c, int b) {
        if (n == 0) {
            return;
        }
        TOH(n-1, a,b,c);
        System.out.println("Moving " + n + "th disk from " + a + " to " + c);
        TOH(n-1, b,c,a);
    }
    public static void main(String[] args) {
        TOH(3,1,3,2); 
    }
}
