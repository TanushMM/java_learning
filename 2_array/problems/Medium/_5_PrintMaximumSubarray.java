public class _5_PrintMaximumSubarray {
    public static void kadanesAlgorithm(int[] array) {
        int maxSum = 0;
        int sum = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for(int i =0; i < array.length; i++) {
            if (sum == 0) {
                ansStart = i;
            }
            sum += array[i];
            if (maxSum < sum) {
                maxSum = sum;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("Max Sum: " + maxSum);
        // System.out.println(ansStart);
        // System.out.println(ansEnd);
        System.out.println("Max Subarray with with sum: ");
        for(int i = ansStart; i<=ansEnd; i++) {
            System.out.print(array[i] +" ");
        }

    }
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4}; //-2,1,-3,4,-1,2,1,-5,4    5,4,-1,7,8
        kadanesAlgorithm(array);
    }    
}
