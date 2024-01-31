public class TrappingRainWater {
    public static void trappedRainWater(int[] heights) {
        int n = heights.length;
        // left Max
        int[] leftMax = new int[n];
        leftMax[0] = heights[0];
        for (int i =1; i < n; i++) {
            leftMax[i] = Math.max(heights[i], leftMax[i-1]);
        }
        // for (int i = 0; i < leftMax.length; i++) {
        //     System.out.print(leftMax[i] + " " );
        // }
        // System.out.println();

        // right Max
        int[] rightMax = new int[n];
        rightMax[n-1] = heights[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            rightMax[i] = Math.max(heights[i], rightMax[i+1]);
        }

        //trapped rain water
        int trappedWater = 0;
        for (int i = 0; i< n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - heights[i]);
        }

        System.out.println("Trapped water: "+ trappedWater);
    }
    public static void main(String[] args) {
        int[] heights = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        trappedRainWater(heights);
    }   
}
