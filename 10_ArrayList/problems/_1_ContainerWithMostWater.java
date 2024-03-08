public class _1_ContainerWithMostWater {
    public static void bruteForce(int[] height) {
        int maxWater = Integer.MIN_VALUE;
        for(int i =0; i < height.length; i++) {
            for(int j=i+1; j<height.length; j++) {
                int minHeight = Math.min(height[i], height[j]);
                int area = minHeight * (j-i);
                maxWater = Math.max(maxWater, area);
            }
        }
        System.out.println("Area of maximum water: " + maxWater);
    }
    public static void twoPointerApproach(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxWater = Integer.MIN_VALUE;
        while (start < end) {
            int minHeight = Math.min(height[start], height[end]);
            int area = minHeight * (end-start);
            maxWater = Math.max(maxWater, area);
            if (height[start] < height[end]) {
                start++; 
            } else {
                end--;
            }
        }
        System.out.println("Max water: " + maxWater);
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        bruteForce(height);
        twoPointerApproach(height);
    }    
}
