public class palindrome {
    public static void main(String[] args) {
        int n = 121;
        int m = n;
        int rev_number = 0;
        while (m > 0) {
            int mod = m%10;
            rev_number = (rev_number * 10) + mod;
            m = m/10;
        }
        if (n == rev_number) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
