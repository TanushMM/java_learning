import java.util.*;

public class _9_Subset_2 {
    public static void helper(int[] nums, int index, List<List<Integer>> list, List<Integer> tempList) {
        if (index == nums.length) {
            // the 2 lines below are added so that the sorted ArrayList is used to add
            // also to compare, if we sort the tempList directly, then it changes the position o fhte index
            // leading to logical erroes when we remove that element in line 23
            List<Integer> anotherTemp = new ArrayList<>(tempList);
            Collections.sort(anotherTemp);
            if (list.contains(anotherTemp) == false) {
                list.add(new ArrayList<>(anotherTemp));
            }
            return;
        }

        // without the currrent element
        helper(nums, index+1, list, tempList);

        // with current element
        tempList.add(nums[index]);
        helper(nums, index+1, list, tempList);

        // removing the last added element 
        tempList.remove(tempList.size()-1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        // Duplicates are not allowed
        helper(nums, 0, list, tempList);
        System.out.println(list);
    }
}
