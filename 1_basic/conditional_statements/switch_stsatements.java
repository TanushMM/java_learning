import java.util.*;
public class switch_stsatements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        int x = sc.nextInt();
        switch(x){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Error");
                break;
        }
        sc.close();
    }   
}
