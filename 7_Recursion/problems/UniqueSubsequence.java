import java.util.*;

public class UniqueSubsequence {
    public static void uniqueSubsequence(String s, int index, String newString, HashSet<String> set) {
        if (index == s.length()) {
            set.add(newString);
            return;
        }
        // include the current character
        uniqueSubsequence(s, index+1, newString+s.charAt(index), set);
        // not include the current character
        uniqueSubsequence(s, index+1, newString, set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        uniqueSubsequence("ABC", 0, "", set);
        System.out.println(set);
    }    
}
