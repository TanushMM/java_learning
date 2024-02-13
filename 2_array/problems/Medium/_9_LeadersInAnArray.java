import java.util.*;
public class _9_LeadersInAnArray {
    public static void leadersInAnArray(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        for(int i = array.length-1; i >= 0; i--) {
            if (array[i] > max) {
                list.add(array[i]);
                max = Math.max(max, array[i]);
            } else {
                max = Math.max(max, array[i]);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] array = {10, 22, 12, 3, 0, 6};
        leadersInAnArray(array);
    }
}
