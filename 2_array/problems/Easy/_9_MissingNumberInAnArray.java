public class _9_MissingNumberInAnArray {
    public static void main(String[] args) {
        int[] array = {9,6,4,2,3,5,7,0,1};
        int n = array.length;
        int rangeSum = (n * (n+1))/2;
        int currentSum = 0;
        for(int i =0; i < array.length; i++) {
            currentSum += array[i];
        }
        System.out.println(rangeSum - currentSum);
    }    
}
