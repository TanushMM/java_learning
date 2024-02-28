public class RemoveDuplicates {
    public static void removeDuplicates(String s, int index, StringBuilder sb, boolean[] map) {
        // Base case
        if (index == s.length()) {
            System.out.println(sb);
            return;
        }
        
        // Work that has to be done
        if (map[s.charAt(index) - 'a'] == true) {
            removeDuplicates(s, index+1, sb, map);
        } else {
            map[s.charAt(index) - 'a'] = true;
            removeDuplicates(s, index+1, sb.append(s.charAt(index)), map);
        }
    }
    public static void main(String[] args) {
        String s = "appnnacollege";
        removeDuplicates(s, 0, new StringBuilder(""), new boolean[26]);
    }  
}
