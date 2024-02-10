public class SelectionSort {
    public static void selectionSortAscending(int[] array) {
        for(int i =0; i < array.length-1; i++) {
            int minIndex = i;
            for(int j = i+1; j < array.length; j++) {
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

    public static void selectionSortDescending(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            int maxIndex = i;
            for(int j = i+1; j< array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            if(array[maxIndex] > array[i]) {
                int temp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = temp;
            }
        }
    }

    public static void printArray(int[] array) {
        for(int i =0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {4,1,7,6,9,10};
        printArray(array);

        selectionSortAscending(array);

        printArray(array);

        selectionSortDescending(array);

        printArray(array);
    }
}
