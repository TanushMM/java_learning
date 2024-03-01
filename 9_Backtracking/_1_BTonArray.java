public class _1_BTonArray {
    public static void BT(int[] array, int i) {
        if (i == array.length) {
            printArray(array);
            return;
        }
        array[i] = i+1;
        BT(array, i+1);
        array[i] = array[i] - 2;
    }
    public static void printArray(int[] array) {
        for(int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = new int[5];
        BT(array, 0);
        printArray(array);
    }  
}
