public class _6_RotateArrayByKPlaces {
    public static void bruteForce(int[] array, int d) {
        // Brute force using temp array
        int k = d % array.length;
        if (array.length == 1 || array.length == 0) {
            return;
        }
        int[] temp = new int[k];
        for(int i=array.length-k, j = 0; i< array.length; i++, j++) {
            temp[j] = array[i]; 
        }
        for(int i = array.length-1; i >= k; i--) {
            array[i] = array[i-k];
        }
        for(int i =0; i < temp.length; i++) {
            array[i] = temp[i];
        }
    }


    public static void reversalAlgorithm(int[] array, int d) {
        if (array.length == 1 || array.length == 0) {
            return;
        }
        d = d % array.length;
        reverse(array, 0, array.length-1-d);
        reverse(array, array.length-d, array.length-1);
        reverse(array, 0, array.length-1);
    }
    public static void reverse(int[] array, int start, int end) {
        while (start <= end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++; end--;
        }
    }
    public static void printArray(int[] array) {
        for(int i =0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // right rotation
        int[] array = {1,2,3,4,5,6,7};
        bruteForce(array, 3);
        printArray(array);

        int[] array2 = {11,12,13,14,15,16,17};
        reversalAlgorithm(array2, 7);
        printArray(array2);
    }
}
