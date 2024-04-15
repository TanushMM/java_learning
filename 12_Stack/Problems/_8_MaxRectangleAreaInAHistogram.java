import java.util.Stack;

public class _8_MaxRectangleAreaInAHistogram {
    public static int maxRectangleAreaInAHistogram(int[] heights) {
        int[] nextSmallRight = new int[heights.length];
        int[] nextSmallLeft = new int[heights.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = heights.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextSmallRight[i] = heights.length; // small change in the code of next smaller element
            } else {
                nextSmallRight[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for(int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextSmallLeft[i] = -1;
            } else {
                nextSmallLeft[i] = stack.peek();
            }
            stack.push(i);
        }

        for(int i : nextSmallLeft) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : nextSmallRight) {
            System.out.print(i + " ");
        }
        System.out.println();
        int maxRectangleArea = 0;
        for(int i =0; i < heights.length; i++) {
            int height = heights[i];
            int width = nextSmallRight[i] - nextSmallLeft[i] - 1;
            int currArea = height * width;
            maxRectangleArea = Math.max(maxRectangleArea, currArea);
        }
        // int[] area = new int[heights.length];
        // for(int i =0; i < heights.length; i++) {
        //     // area[i] = heights[i] * Math.abs(Math.abs(nextSmallLeft[i] - nextSmallRight[i]) - 1);
        //     maxRectangleArea = Math.max(maxRectangleArea, heights[i] * Math.abs(Math.abs(nextSmallLeft[i] - nextSmallRight[i]) - 1));
        // }
        return maxRectangleArea;
    }
    public static void main(String[] args) {
        int[] heights = {1,1};//{2,1,5,6,2,3};
        System.out.println(maxRectangleAreaInAHistogram(heights));
    }
}
