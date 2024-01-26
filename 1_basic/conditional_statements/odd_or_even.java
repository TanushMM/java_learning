import java.util.*;
public class odd_or_even {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n == 0){
            System.out.print("Neither Even Nor Odd");
        } else if (n%2 == 0){
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
        sc.close();
    }
}
