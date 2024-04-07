import java.util.Stack;

public class _6_ValidParentheses {
    public static boolean validParantheses(String s) {
        Stack<Character> stack = new Stack<>();        
        for(int i =0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                // Opening condition
                stack.push(c);
            } else {
                // closing conditions
                if (stack.isEmpty()) {
                    return false;
                } else if (
                    stack.peek() == '(' && c == ')' ||
                    stack.peek() == '[' && c == ']' ||
                    stack.peek() == '{' && c == '}'
                ) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "({[]}())";
        System.out.println(validParantheses(s));
    }
}
