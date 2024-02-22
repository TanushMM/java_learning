public class AllSubsequence {
    public static void allSubsequence(String s, int index, String newString) {
        if (index == s.length()) {
            System.out.println(newString);
            return;
        }

        // Use the current character
        allSubsequence(s, index+1, newString+s.charAt(index));

        // Not use the current character
        allSubsequence(s, index+1, newString);
    }
    public static void main(String[] args) {    
        allSubsequence("ABC", 0, "");
    }    
}
