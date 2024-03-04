public class _7_KeypadCombination {
    public static String[] keypad = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void printKeypad(String s, int index, String combination) {
        if (index == s.length()) {
            System.out.println(combination);
            return;
        }
        int value = s.charAt(index) - '0';
        String mapping = keypad[value];
        for(int i =0; i < mapping.length(); i++) {
            printKeypad(s, index+1, combination + mapping.charAt(i));
        } 
    }
    public static void main(String[] args) {
        String s = "2"; 
        printKeypad(s, 0, "");
    }
}
