public class PrimeFromRange {
    public static boolean isPrime(int x) {
        if (x == 1) {
            return false;
        }
        //int n = (int) (Math.sqrt(x))* (int)  (Math.sqrt(x));
        for (int i = 2;i<=Math.sqrt(x);i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 10;
        for (int i =1;i<=n;i++) {
            System.out.println(i+" " +isPrime(i));
        }
    }
}
