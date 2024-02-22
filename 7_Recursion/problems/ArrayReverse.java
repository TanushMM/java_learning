public class ArrayReverse {
    public static void arrayReverse(int[] array, int index) {
        if (index == array.length) {
            return;
        }
        arrayReverse(array, index+1);
        if (index >= array.length/2) {
            int temp = array[index];
            array[index] = array[(array.length-1-index)];
            array[(array.length-1-index)] = temp;
        }
        if (index == 0) {
            return;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        // int[] temp = arrayReverse(array, 0);
        arrayReverse(array, 0);
        for(int i: array) {
            System.out.print(i + " ");
        }
    }    
}
