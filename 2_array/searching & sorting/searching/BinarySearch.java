public class BinarySearch {
    public static int binarySearch(int[] array, int element) {
        int start = 0; 
        int end = array.length - 1;
        while (start <= end) {
            // int mid = (start+end) /2;     // This may go beside the storage capacity of Integer in java
            int mid = start + ((end-start)/2);
            if (array[mid] == element) {
                return mid;
            } if (element < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,3,4,7,9,12};
        
        System.out.println(binarySearch(array,3));

        // checking
        // for (int i =0;i<array.length;i++) {
        //     System.out.println(binarySearch(array,array[i]));
        // }
    }
}


// int start = 0;
// int end = array.length - 1 ;
// while (start < end) {
//     if (array[start] == element) {
//         return start;
//     } else if (array[end] == element) {
//         return end;
//     }
//     int mid = (start+end) / 2;
//     if (array[mid] == element) {
//         return mid;
//     } else if (element < array[mid]) {
//         end = mid-1;
//     } else if (element > array[mid]) {
//         start = mid + 1;
//     }
// }
// return -1;