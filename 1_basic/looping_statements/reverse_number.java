public class reverse_number {
    public static void main(String[] args) {
        int n = 10899;
        int rev_num = 0;
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            rev_num = (rev_num*10) + lastDigit;
            n = n/10;
        }
        System.out.print("\n"+rev_num);
    }
}
