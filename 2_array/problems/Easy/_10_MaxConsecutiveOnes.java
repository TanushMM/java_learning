public class _10_MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] array = {1,1,0,1,1,1};
        // int[] array = {1,0,1,1,0,1};
        int maxCount = 0;
        int count = 0;
        for(int i =0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        System.out.println("Max count: " +maxCount);
    }    
}
