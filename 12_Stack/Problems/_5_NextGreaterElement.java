import java.util.Stack;

public class _5_NextGreaterElement {
    public static void nextGreaterElement(int[] array, int[] answer) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = array.length-1; i>= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= array[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                answer[i] = -1;
            } else {
                answer[i] = stack.peek();
            }
            stack.push(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array = {6,8,8,1,3};
        int[] answer = new int[array.length];
        nextGreaterElement(array, answer);

        for(int i : answer) {
            System.out.println(i + " ");
        }
    }
}
