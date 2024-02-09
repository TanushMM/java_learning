public class SubString {
    public static String subString(String str, int start, int end) {
        String sub = "";
        for (int i = start; i < end ;i++) {
            sub += str.charAt(i);
        }
        return sub;
    }
    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println(subString(str,3,8));

        // in built method
        System.out.println(str.substring(3,8));
    }
}