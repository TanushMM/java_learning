public class StringMergeSort {
    public static void mergeSort(String[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + ((end-start)/2);
        mergeSort(array, start, mid);
        mergeSort(array, mid+1, end);
        merge(array, start, mid, end);
    }
    public static void merge(String[] array, int start, int mid, int end) {
        String[] answer = new String[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (array[i].compareTo(array[j]) <= 0) {
                answer[k++] = array[i++];
            } else {
                answer[k++] = array[j++];
            }
        }

        while (i <= mid) {
            answer[k++] = array[i++];
        }

        while (j <= end) {
            answer[k++] = array[j++];
        }

        // copying the answer array to the original array
        for(i = start,k = 0; k<answer.length; i++,k++) {
            array[i] = answer[k];
        }
    }

    public static void printArray(String[] array) {
        for(String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] array = {"earth", "mars", "mercury", "jupiter", "saturn", "uranus!"};
        printArray(array);
        mergeSort(array,0, array.length-1);
        printArray(array);
    }
}