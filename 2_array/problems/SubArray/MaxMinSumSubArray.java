public class MaxMinSumSubArray {
    public static void bruteForce(int[] array) {
        // o(n^3)
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                for(int k = i; k <= j; k++) {
                    sum += array[k];
                }
                if (sum < min) {
                    min = sum;
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void prefixSum(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] prefix = new int[array.length];

        // calculate prefix array
        prefix[0] = array[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = array[i] + prefix[i-1];
        }

        for (int i =0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if (currSum < min) {
                    min = currSum;
                }
                if (currSum > max) {
                    max = currSum;
                }
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        // printing array
        // for (int i =0; i < prefix.length; i++) {
        //     System.out.print(prefix[i] + " ");
        // }

    }

    public static void kadaneAlgorithm(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < array.length; i++) {
            currSum = currSum + array[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Max: " + maxSum);
    }

    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};
        System.out.println("Brute Force");
        bruteForce(array);

        System.out.println("Prefix Array");
        prefixSum(array);

        System.out.println("Kadane's Algorithm");
        kadaneAlgorithm(array);
    }
}
