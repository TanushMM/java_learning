package string;
import java.util.*;

public class stringusingdelimiter {
    public static void main(String args[]){

        String tanush = new String();

        tanush = "Hi/this is tanush/thanks";

        Scanner sc = new Scanner(tanush);

        //NOTE

        //sc.useDelimiter("/");

        while (sc.hasNext()){
            System.out.println(sc.next());
        }
        sc.close();
    }
}
