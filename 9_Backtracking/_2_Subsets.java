public class _2_Subsets {
    public static void subset(String s, String answer, int i) {
        if (i == s.length()) {
            System.out.println(answer);
            return;
        }
        subset(s,answer + s.charAt(i),i+1);
        subset(s, answer, i+1);
    }
    public static void main(String[] args) {
        String s = "ABC";
        subset(s, "", 0);
    }    
}
