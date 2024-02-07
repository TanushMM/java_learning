import java.util.*;
public class _7_UnionOfArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6};
        int[] b = {2,3,5};
        List<Integer> lst = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for(int i =0; i < b.length; i++) {
            set.add(b[i]);
        }
        for(Integer i: set) {
            lst.add(i);
        }
        System.out.println(lst);
    }
}
