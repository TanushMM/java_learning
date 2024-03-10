import java.util.*;
public class _5_LonelyNumberInAnArray {
    public static List<Integer> findLonely(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for(int i : nums) {
            if (map.get(i) == 1 && !(map.containsKey(i+1)) && !(map.containsKey(i-1))) {
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] array = {1,3,5,3};
        List<Integer> list = findLonely(array);
        System.out.println(list);
    }    
}
