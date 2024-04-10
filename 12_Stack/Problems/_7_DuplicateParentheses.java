import java.util.Stack;

public class _7_DuplicateParentheses {
    /*
     * assuming that the string is has valid parentheses
     */
    public static boolean hasDuplicateParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i =0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ')') {
                // opening condition
                stack.push(c);
            } else {
                // closing condition
                int count = 0;
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    stack.pop();
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "((a+b)+(c+d))";
        System.out.println(hasDuplicateParentheses(s));
    }
}
