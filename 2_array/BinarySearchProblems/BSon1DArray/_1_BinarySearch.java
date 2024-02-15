public class _1_BinarySearch {
    public static int iterativeBinarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length-1;
        while(start <= end) {
            int mid = start + ((end-start)/2);
            if(array[mid] == key) {
                return mid;
            } else if (key < array[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
    public static int recursiveBinarySearch(int[] array, int key, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + ((end-start)/2);
        if (array[mid] == key) {
            return mid;
        } else if (key < array[mid]) {
            return recursiveBinarySearch(array, key, start, mid-1);
        } else {
            return recursiveBinarySearch(array, key, mid+1, end);
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(iterativeBinarySearch(array, 1));
        System.out.println(recursiveBinarySearch(array, 10, 0, array.length-1));
    }    
}
