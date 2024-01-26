public class sum_of_digit {
    public static void main(String[] args) {
        int n = 1234;
        int m = n;
        int sum = 0;
        while (m>0) {
            int reminder = m%10;
            sum = sum + reminder;
            m = m/10;
        }
        System.out.println(sum);
    }
}
