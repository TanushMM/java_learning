import java.util.Stack;
public class _1_PushAtBottom {
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int value = stack.pop();
        pushAtBottom(stack, data);
        stack.push(value);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        pushAtBottom(stack, 420);
        System.out.println(stack);
    }    
}
