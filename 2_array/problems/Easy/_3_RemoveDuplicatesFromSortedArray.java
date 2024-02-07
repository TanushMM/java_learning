public class _3_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] array = {0,0,1,1,1,2,2,3,3,4};

        int i = 0, j = 0;
        while (j < array.length) {
            if (array[i] == array[j]) {
                j++;
            } else {
                i++;
                array[i] = array[j];
                j++;
            }
        }
        while (i<array.length) {
            array[i] = 0;
            i++;
        }

        // printing array
        for(i =0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
    }
}