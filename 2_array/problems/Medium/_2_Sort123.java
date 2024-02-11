public class _2_Sort123 {
    public static void sort123(int[] array) { // Using Bubble Sort
        for(int i =0; i < array.length; i++) {
            for(int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for(int i:array) {
            System.out.print(i + " ");
        }
    }
    public static void dnfSort(int[] array) {
        int low = 0;
        int mid = 0;
        int high = array.length-1;
        while (mid <= high) {
            if (array[mid] == 0) {
                int temp = array[mid];
                array[low] = array[mid];
                array[mid] = temp;
                low++; mid++;
            } else if (array[mid] == 1) {
                mid++;
            } else {
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;
            }
        }
        for(int i:array) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {0, 2, 1, 2, 0, 1};
        sort123(array);
        System.out.println();
        dnfSort(array);
    }    
}
