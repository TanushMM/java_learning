public class StringImmutability {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d'};
        String str = "abcd";
        // Strings are immutable
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println("\n"+str);

        // String Comparison
        String s1 = "mumbai";
        String s2 = "mumbai";
        // Here String interning is taking place
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3 = "chennai";
        String s4 = new String("chennai");
        // here no string interning takes place because we used new keyword
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));


    }    
}
