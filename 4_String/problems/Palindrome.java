public class Palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        for (int i =0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i -1)) {
                System.out.println("Not Palindrome");
                return;
            } else {
                System.out.println("Palindrome");
                return;
            }
        }
    }
}