import java.util.*;

public class _8_Subset_1 {
    public static void helper(int[] array, List<List<Integer>> answer, List<Integer> temp,int i) {
        if (i == array.length) {
            answer.add(new ArrayList<>(temp));
            return;
        }
        // without the current character
        helper(array,answer, temp, i+1);
        
        // with currnet chcracter
        temp.add(array[i]);
        helper(array,answer, temp,i+1);

        // removing the last added character
        temp.remove(temp.size()-1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        // Duplicates are allowed
        helper(nums, list,temp ,0);
        System.out.println(list);
    }
}
