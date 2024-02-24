public class NoOfOccurance {
    public static void noOfOccurance(int[] array, int key, int index) {
        if (index == array.length) {
            return;
        }
        if (array[index] == key) {
            System.out.print(index + " ");
            noOfOccurance(array, key, index+1);
        } else {
            noOfOccurance(array, key, index+1);
        }
    }
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        noOfOccurance(array, 2, 0);
    }    
}
