public class _8_ReverseAnArrayByKPlaces {
    public static void reverse(Integer[] array, int start, int end) {
        while (start <= end) {
            Integer temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {

        // Integer[] answer = arr.toArray(new Integer[0]);
        Integer[] answer = {10,9,8,7,6};
        // reverse(answer, m+1, answer.length-1);
        reverse(answer, 2+1, answer.length-1);
        for(Integer i : answer) {
            System.out.print(i + " ");
        }
    }
}
