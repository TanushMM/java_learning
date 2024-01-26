import java.util.*;
public class area_of_circle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f;
        System.out.print("Enter the Radius: ");
        float radius = sc.nextFloat();
        float area = pi * radius * radius;
        System.out.println("Area: "+area);
        sc.close();
    }
}


/*Java automatically takes a number with decimal point as double
hence we have to add 'f' after the decimal number to tell its a float
*/