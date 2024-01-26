import java.util.*;

public class sum_of_cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float total = a+b+c;
        float gst = total * 0.18f;
        total = total + gst;
        System.out.println("Total: "+total);
        int $ = 24;
        System.out.println($);
        sc.close();

        // variable names can start with _ and $
    }
}
