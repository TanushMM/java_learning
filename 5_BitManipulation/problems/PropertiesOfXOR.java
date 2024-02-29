public class PropertiesOfXOR {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x ^ x);

        // swap two numbers without third variable
        x = 10;
        int y = 15;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x);
        System.out.println(y);

        // add 1 to a positive integer
        System.out.println(-(~x));
    }
}
