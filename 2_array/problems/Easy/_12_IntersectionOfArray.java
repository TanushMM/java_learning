import java.util.ArrayList;
import java.util.HashSet;

public class _12_IntersectionOfArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {2,4,6,8,10};

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i < a.length; i++) {
            set.add(a[i]);
        }
        for(int i =0; i < b.length; i++) {
            if (set.contains(b[i])) {
                list.add(b[i]);
            }
        }

        System.out.println(list);
    }
} 