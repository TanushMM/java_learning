public class _2_PairSum1 {
    public static void bruteForce(int[] array, int target) {
        for(int i =0; i < array.length; i++) {
            for(int j =i+1; j< array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(i+","+j);
                }
            }
        }
    }
    public static void twoPointerApproach(int[] array, int target) {
        int start = 0;
        int end = array.length-1;
        while (start < end) { // start != end
            if (array[start] + array[end] == target) {
                System.out.println(start + "," + end);
                start++; //  if this line is not there we have to return the value
                // or else the loop goes infinite as the target is reached and 
                // there is no increment in start or end
            } else if (array[start] + array[end] < target) {
                start++;
            } else {
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        bruteForce(array, 8);
        twoPointerApproach(array, 8);
    }    
}
