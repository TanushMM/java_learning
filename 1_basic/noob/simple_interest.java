
import java.util.*;

public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        float p = sc.nextInt();
        System.out.print("Enter the tenure in years: ");
        float n = sc.nextInt();
        System.out.print("Enter the rate of interest: ");
        float r = sc.nextInt();
        float interest = (p*n*r)/100;
        System.out.print("The amount of Interest is: "+interest);
        sc.close();
    }
}
