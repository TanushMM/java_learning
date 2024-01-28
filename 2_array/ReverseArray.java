public class ReverseArray {
    public static int[] reverseArray(int[] array) {
        int end = array.length / 2;
        for (int i = 0; i < end;i++) {
            int oppositeIndex = (array.length - 1) - i;
            int temp = array[i];
            array[i] = array[oppositeIndex];
            array[oppositeIndex] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        for (int i =0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        array = reverseArray(array);

        for (int i =0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
