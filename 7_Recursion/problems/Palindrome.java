public class Palindrome {
    public static boolean palindrome(String str, int index) {
        if (index >= str.length()/2) {
            return true;
        }
        if (str.charAt(index) != str.charAt(str.length()-1-index)) {
            return false;
        }
        return palindrome(str, index+1);

    }
    public static void main(String[] args) {
        System.out.println(palindrome("kayak", 0));
    }    
}
