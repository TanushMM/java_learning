public class LowerCaseVowels {
    public static int lowerCase(String str) {
        int count = 0;
        for (int i =0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "hellO World";
        System.out.println(lowerCase(str));
    }
}