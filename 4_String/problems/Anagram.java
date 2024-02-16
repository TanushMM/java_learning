public class Anagram {
    public static boolean anagram(String str1, String str2) {
        // using frequency array
        int[] str1Freq = new int[26];
        int[] str2Freq = new int[26];

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i=0; i < str1.length(); i++) {
            str1Freq[str1.charAt(i) - 'a'] += 1; 
        }
        for (int i=0; i < str2.length(); i++) {
            str2Freq[str2.charAt(i) - 'a'] += 1; 
        }
        for (int i = 0; i < 26; i++) {
            if (str1Freq[i] != str2Freq[i]) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.println(anagram(str1, str2));
    }
}