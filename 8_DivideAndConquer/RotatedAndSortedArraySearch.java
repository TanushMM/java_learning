public class RotatedAndSortedArraySearch {
    public static int search(int[] array, int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + ((ei-si)/2);
        if (array[mid] == target) {
            return mid;
        }
        if (array[si] <= array[mid]) {
            if (array[si] <= target && target <= array[mid]) {
                return search(array, target, si, mid-1);
            } else {
                return search(array, target, mid+1, ei);
            }
        } else {
            if (array[mid] <= target && target <= array[ei]) {
                return search(array, target, mid+1, ei);
            } else {
                return search(array, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2};
        int index = search(array, 0, 0, array.length-1);
        System.out.println(index);
    }
}