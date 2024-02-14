public class _14_CountSubarraysWithGivenSum {
    public static void countSubarrayWithGivenSum(int[] array, int k) { // Brute Force
        int count = 0;
        for(int i =0; i < array.length; i++) {
            int sum = 0;    
            for(int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println("Count : " + count);
    }
    public static void prefixArray(int[] array, int k) {
        int count = 0;
        int[] prefix = new int[array.length];
        prefix[0] = array[0];
        for(int i =1; i < array.length; i++) {
            prefix[i] = prefix[i-1] + array[i];
        }
        for(int i = 0; i < array.length; i++) {
            int sum = 0;
            for(int j = i; j < array.length; j++) {
                sum = i == 0 ? prefix[j]: prefix[j] - prefix[i-1];
                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println("Count: " + count);
    }
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 4};
        int k  =6;
        countSubarrayWithGivenSum(array, k);
        prefixArray(array, k);
    }    
}
