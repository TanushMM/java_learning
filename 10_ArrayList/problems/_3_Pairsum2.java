public class _3_Pairsum2 {
    public static int[] pairSum(int[] array, int target) {
        int pivotIndex = -1;
        for(int i = 1; i < array.length; i++) {
            if (array[i-1] > array[i]) {
                pivotIndex = i-1;
                break;
            }
        }

        int start = pivotIndex + 1;
        int end = pivotIndex;

        while (start != end) {
            if (array[start] + array[end] == target) {
                return new int[]{start,end};
            } else if (array[start] + array[end] < target) {
                start = (start+1) % array.length;
            } else {
                end = (end-1+array.length) % array.length;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] array = {5,6,1,2,3,4};
        int[] answer = pairSum(array, 4);
        for(int i : answer) {
            System.out.println(i);
        }

        
    }    
}
