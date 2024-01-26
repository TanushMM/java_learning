import java.util.*;
public class largest_of_2_numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of M: ");
        int m = sc.nextInt();
        if(n>m){
            System.out.print(n+" is greater than "+m);
        } else {
            System.out.print(m+" is greater than "+n);
        }
        sc.close();
    }
}
