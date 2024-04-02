import java.util.Stack;

public class _3_ReverseString {
    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i =0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "Tanush";
        System.out.println(s);
        s = reverseString(s);
        System.out.println(s);
    }
}