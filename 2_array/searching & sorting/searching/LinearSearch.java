public class LinearSearch {
    public static int linearSearch(int[] array, int element) {
        for (int i=0; i<array.length;i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {5,2,10,3,8};
        System.out.println(linearSearch(array, 5));
        System.out.println(linearSearch(array, 20));
    }
}