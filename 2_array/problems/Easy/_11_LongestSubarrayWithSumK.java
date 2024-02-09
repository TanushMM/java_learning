import java.util.*;
public class _11_LongestSubarrayWithSumK {
    public static void betterApproach(int[] array, int k) {
        int maxLength = 0;
        for(int i =0; i < array.length; i++) {
            int sum = 0;
            for(int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum == k) {
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }
        System.out.println(maxLength);
    }
    public static void usingHashMap(int[] array, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for(int i =0; i < array.length; i++) {
            sum += array[i];
            // map.put(sum, i);
            if (sum == k) {
                maxLength = Math.max(maxLength, i+1);
                map.put(sum, i);
            } else {
                int key = sum - k;
                int index = map.getOrDefault(key, -1);
                if (index != -1) {
                    maxLength = Math.max(maxLength, i-index);
                }
                map.put(sum, i);
            }
        }
        System.out.println(maxLength);
    }
    public static void main(String[] args) {
        // int[] array = {1,2,3,1,1,1,1,4,2,3};
        // int[] array = {10, 5, 2, 7, 1, 9 };
        // int[] array = {-5, 8, -14, 2, 4, 12};
        int[] array = {-1, 1, 1};
        betterApproach(array, 1);
        usingHashMap(array, 1);
    }
}
