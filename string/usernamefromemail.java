package string;
import java.util.*;


//TO GIVE A USERNAME FROM A GIVEN EMAIL ==============================================================


public class usernamefromemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Email: ");
        String email = sc.nextLine();
        String hello = "";

        for(int i =0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }else{
                hello += email.charAt(i);
            }
        }
        System.out.print(hello);
        sc.close();
    }
}
