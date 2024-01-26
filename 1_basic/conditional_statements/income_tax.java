import java.util.*;
public class income_tax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Income: ");
        float income = sc.nextFloat();
        if(income < 500000){
            System.out.print("Tax: 0");
        } else if (income>500000 && income < 1000000){
           System.out.print("Tax: "+income*0.20);
        } else {
            System.out.println("tax: "+income*0.30);
        }
        sc.close();
    }
}
