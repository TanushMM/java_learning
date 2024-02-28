public class Substring {
    public static void subString(String s, int start) {
        if (start == s.length()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < s.length(); i++) {
            sb.append(s.charAt(i));
            System.out.print(sb + " ");
        }
        System.out.println();
        subString(s, start+1);
    }
    public static void main(String[] args) {
        String s = "hello";
        subString(s, 0);
    }
}
