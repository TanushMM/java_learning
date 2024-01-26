import java.util.*;

public class binarytodecimal {
    public static void printarray(char array[]){
        for(int i = 0; i < 3; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary Number of 3 bits (0-7): ");
        String number = sc.nextLine();
        char array[] = new char[3];

        for(int i =0; i < 3; i++){
            char temp = number.charAt(i);
            array[i] = temp;
        } 

        int num = 1;
        System.out.println(num);
        boolean hello = true;
        for(int i =0; i < 3; i++){
            while (hello){
                hello = false;
            }
            if(array[i] == '1'){
                num = num << 1;
                System.out.println(num);
            } else if (array[i] == '0'){
                num = num << 1;
                System.out.println(num);
                int bitMask = 1;
                int notBitMask = ~(bitMask);
                num = num & notBitMask;
            }
        }

        System.out.print(num);

        sc.close();


    }
}
