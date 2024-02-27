public class StringInReverse {
    public static void stringInReverse(String s, int index) {
        if (index == s.length()-1) {
            System.out.println(s.charAt(index));
            return;
        }
        stringInReverse(s, index+1);
        System.out.println(s.charAt(index));
    }
    public static void main(String[] args) {
        String s = "hello";
        stringInReverse(s, 0);
    }    
}
