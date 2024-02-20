public class FastExponentiation {
    public static int fastExponentiation(int a, int n) { // a to the power of n
        int answer = 1;
        while (n > 0) {
            if ((n&1) != 0) {
                answer*=a;
            }
            a = a * a;
            n = n >> 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(fastExponentiation(2, 5));
    }
}
