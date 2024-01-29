
public class MyApproach {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int minPosition = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }
            int temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;

        }
    }
    public static void main(String[] args) {
        int[] array = {-1,0,50,-66,1032,-8057};
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        selectionSort(array);
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
}
 