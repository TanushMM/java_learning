public class InsertionSort {
    public static void insertionSort(int[] array) {
        for(int i =1; i < array.length; i++) {
            int current = array[i];
            int j = i-1;
            while (j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
    public static void main(String[] args) {
        int[] array = {4,1,7,6,9,10};
        for(int i =0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();

        insertionSort(array);

        for(int i =0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
    }    
}
