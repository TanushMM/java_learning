public class MyApproach {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1 ; i++) {
            int swap = 0;
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {7,8,3,1,2}; //    1,2,3,4,5  
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        bubbleSort(array);
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
}
