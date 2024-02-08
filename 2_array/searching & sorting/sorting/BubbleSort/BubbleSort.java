public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int length = array.length;
        for(int i =0; i < length-1; i++) {
            boolean swap = false;
            for(int j = 0; j < length-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if (swap == false) {
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {4,1,7,6,9,10};
        for(int i =0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();

        bubbleSort(array);

        for(int i =0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
    }
}
