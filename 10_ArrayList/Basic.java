import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
public class Basic {
    public static void main(String[] args) {
        // ArrayList initialization
        ArrayList<Integer> list = new ArrayList<>();

        // list.add();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // list.Get()
        System.out.println(list.get(1));

        // list.remove()
        list.remove(1);
        System.out.println("List after remove(): " + list);

        // list.set()
        list.set(1, 100);
        System.out.println(list);

        // list.contains()
        System.out.println(list.contains(5));
        System.out.println(list.contains(10));

        // list.add(<Index>, <Element>)
        list.add(2,200);
        System.out.println(list);

        // list.size()
        System.out.println(list.size());


        // Ascending order sorting
        Collections.sort(list);
        System.out.println(list);

        //descending order sorting
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);


        // Multidimensional ArrayList
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        System.out.println(matrix);
    }    
}
