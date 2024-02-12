import java.util.*;

public class _3_MajorityElementGreaterThanNBy2 {
    public static void betterApproach(int[] array) { // Hash Map
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = array.length;
        for(int i =0; i < n; i++) {
            int number = array[i];
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > (n/2)) {
                System.out.println("Majority Element (Hash Map): " + entry.getKey());
            }
        }
    } 
    public static void optimalApproach(int[] array) {
        int element = 0;
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (count == 0) {
                element = array[i];
            }
            if (array[i] == element) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println("Majority Element (Moore's Voting Algorithm): " + element);
    }
    public static void main(String[] args) {
        int[] array = {2,2,1,1,1,2,2};
        betterApproach(array);
        System.out.println();
        optimalApproach(array);
    }
}
