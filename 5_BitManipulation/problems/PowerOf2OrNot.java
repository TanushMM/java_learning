public class PowerOf2OrNot {
    public static boolean powerOf2OrNot(int n) {
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(powerOf2OrNot(32));
        System.out.println(powerOf2OrNot(10));
    }
}
