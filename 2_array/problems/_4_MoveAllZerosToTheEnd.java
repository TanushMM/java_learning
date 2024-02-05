public class _4_MoveAllZerosToTheEnd {
    public static void main(String[] args) {
        int[] array = {1,4,0,2,0,0,4,5,0,0,2,8,6};
        int i = 0, j = 0;
        while (j < array.length) {
            if (array[j] == 0) {
                j++;
            } else {
                array[i] = array[j];
                i++; j++;
            }
        }
        while (i < array.length) {
            array[i] = 0;
            i++;
        }

        // printing array
        for(i =0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
    }
}
