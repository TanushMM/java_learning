public class PrintDigit {
    public static void printDigit(int n, String[] digits) {
        if (n == 0) {
            return;
        }
        printDigit(n/10, digits);
        int onesPlace = n % 10;
        System.out.print(digits[onesPlace] + " ");
    }
    public static void main(String[] args) {
        String[] digits = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        printDigit(2019, digits);    
    }
}
