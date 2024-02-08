public class SelectionSort {
    public static void selectionSort(int[] array) {
        for(int i =0; i < array.length; i++) {
            int minIndex = i;
            for(int j = i; j < array.length; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if(array[i] > array[minIndex]) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {4,1,7,6,9,10};
        for(int i =0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();

        selectionSort(array);

        for(int i =0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
    }
}
