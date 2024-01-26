
import java.util.*;

public class decimaltobinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number between 0 and 7: ");
        int number = sc.nextInt();
        int array[] = new int[4];

        for(int i =3; i >= 0;i--){
            int bitMask = 1<<i;
            if((bitMask & number) == 0) {
                array[i] = 0;
            }else{
                array[i] = 1;
            }
        }

        for(int i =3; i >= 0;i--){
            System.out.print(array[i]);
        }
        sc.close();
    }
}
