package string;
import java.util.*;


//REPLACING A LETTER WITH ANOTHER LETTER===============================================================

public class letterwithanotherletter {
    public static void main(String[] args) {

        //THIS FOLLOWING CODE IS NOT SPACE AND TIME OPTIMIZED, CHECK BELOW TO FIND THE OPTIMIZED CODE

        Scanner sc = new Scanner(System.in);
        String tanush = new String();
        System.out.print("Enter a String: ");

        tanush = sc.nextLine();
        int len = tanush.length();
        System.out.print("Original: "+ tanush + " ; ");
        char array[] = new char[len];

        // CONVERTING CHAR FROM STRING INTO A CHARACTER ARRAY
        for(int i =0; i < len; i++){
            array[i] = tanush.charAt(i);
        }
        //CHECKING THE CONDITION
        for(int i =0; i < len; i++){
            if(array[i] == 'e'){
                array[i] = 'i';
            }
        }
        System.out.print("Converted: ");
        for(int i =0; i < len; i++){
            System.out.print(array[i]);
        }


        sc.close();
    }
}

        //OPTIMIZED CODE=====================
        // Scanner scr = new Scanner(System.in);
        // String tanush = new String();
        // System.out.print("Enter a String: ");

        // tanush = scr.nextLine();
        // int len = tanush.length();
        // System.out.print("Original: "+ tanush + " ; ");
        // String tanush1 = "";
        // for(int i = 0;i < len; i++){
        //     if(tanush.charAt(i) == 'e'){
        //         tanush1 += "i";
        //     }else{
        //         tanush1 += tanush.charAt(i);
        //     }
        // }

        // System.out.print("Converted: " + tanush1);
