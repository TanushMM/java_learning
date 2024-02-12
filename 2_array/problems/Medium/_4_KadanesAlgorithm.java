public class _4_KadanesAlgorithm {
    public static void kadanesAlgorithm(int[] array) {
        int maxSum = 0;
        int sum = 0;
        for(int i =0; i < array.length; i++) {
            sum += array[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxSum);

    }
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        kadanesAlgorithm(array);
    }    
}
