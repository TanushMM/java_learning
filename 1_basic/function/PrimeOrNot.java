public class PrimeOrNot {
    public static boolean prime(int x) {
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
        if (prime(4)) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }       
    }
}
