
import java.util.*;

public class sum_of_2_numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        int output = a+b;
        // int final = a*b;
        System.out.println("Sum of two Numbers: "+ output);
        sc.close();
    }
}