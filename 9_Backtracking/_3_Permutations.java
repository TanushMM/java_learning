public class _3_Permutations { 
    public static void permutations(String s, String answer) {
        if (s.length() == 0) {
            System.out.println(answer);
            return;
        }
        for(int i =0; i < s.length(); i++) {
            char c = s.charAt(i);
            String newString = s.substring(0, i) + s.substring(i+1);
            permutations(newString, answer + c);
        }
    }
    public static void main(String[] args) {
        String a = "ABC";
        permutations(a, "");
    }
}
