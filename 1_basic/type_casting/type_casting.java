public class type_casting {
    public static void main(String args[]){
        int a = 10;
        long b = a;
        System.out.println(b);
        /*this type conversion is allowed
         * because long(destination) is bigger than int(source)
         */
        // long c = 10;
        // int d = c;
        // System.out.println(d);
        /*this type conversion is not allowed
        * because int(destination) is smaller than long(source)
        */

        // explicit type casting
        float marks = 99.98f;
        // int mark = marks;
        // error: incompatible types: possible lossy conversion from float to int
        int mark = (int) marks;        
        System.out.println(mark);


        // type promotion only in expression 
        char x = 'a';
        char y = 'b';
        System.out.println((int)x);
        System.out.println((int)y);
        System.out.println(y-x);
    }
}
