import java.util.Stack;

public class _4_StockSpan {
    public static void stockSpanUsingStack(int[] stocks, int[] span) {
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;
        stack.push(0);


        for(int i =1; i < stocks.length; i++) {
            int currentPrice = stocks[i];
            while (!stack.isEmpty() && currentPrice > stocks[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i+1;
            } else {
                int prevHigh = stack.peek();
                span[i] = i - prevHigh;
            }
            stack.push(i);
        }
        for(int i : span) {
            System.out.println(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] stocks = {100,80,60,70,60,85,100};
        int[] span = new int[stocks.length];
        stockSpanUsingStack(stocks, span);
    }
}
