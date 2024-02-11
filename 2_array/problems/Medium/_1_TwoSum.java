import java.util.HashMap;
public class _1_TwoSum {
    public static void twoSumBruteForce(int[] array, int target) {
        for(int i =0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                if ((array[i] + array[j]) == target) {
                    System.out.println(i +" "+j);
                }
            }
        }
    }
    public static void twoSumBetter(int[] array, int target) { // using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < array.length; i++) {
            int reminder = target - array[i];
            if (map.containsKey(reminder)) {
                System.out.println(i + " " + map.get(reminder));
            } else {
                map.put(array[i], i);
            }
        }
    }
    public static void twoSumOptimal(int[] array, int target) { // 2 Pointer approach
        int start = 0;
        int end = array.length-1;
        while (start < end) {
            int sum = array[start] + array[end];
            if (sum == target) {
                System.out.println(start +" "+end);
                break;
            } else if (sum < target) {
                start++;                
            } else {
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int target = 9;
        twoSumBruteForce(array, target);
        twoSumBetter(array, target);
        twoSumOptimal(array, target);
    }    
}
