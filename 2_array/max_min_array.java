import java.util.*;

public class max_min_array {
    public static void printArray(int[] array){
        for(int i =0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i =0; i < size;i++){
            System.out.print("Enter element "+(i+1)+" : ");
            array[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0;i<array.length;i++){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Maximum element: "+max);
        System.out.println("Minimum element: "+min); 

        sc.close();
    }
}
