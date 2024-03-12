public class MergeSort {
    public static void merge(int[] array, int si, int mid, int ei) {
        int[] temp = new int[ei-si+1];
        int i = si; // left iterator
        int j = mid+1; //right iterator
        int k = 0; // temporary array iterator

        while(i <= mid && j <= ei) {
            /*
             * loop both left and right part, if unequal length then some elements
             * might be left out in either of the part which is then added to 
             * temp array with two while loops after the current while loop gets over
             */
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++; k++;
            } else {
                temp[k] = array[j];
                j++; k++;
            }
        }
        while(i <= mid) { // left part of the array
            temp[k++] = array[i++];
        }
        while (j <= ei) { // right part of the array
            temp[k++] = array[j++];
        }

        // copy the temp array to the original array
        for(k = 0, i =si; k < temp.length; k++,i++) {
            array[i] = temp[k];
        }
    }
    public static void mergeSort(int[] array, int si, int ei) {
        if (si >= ei) {
            return;
        }       
        int mid = (si + ((ei-si)/2));
        mergeSort(array, si, mid);
        mergeSort(array, mid+1, ei);
        merge(array, si, mid, ei);
    }

    
    public static void printArray(int[] array) {
        for(int i =0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {6,3,9,5,2,8};
        printArray(array);
        
        mergeSort(array, 0, array.length-1);

        printArray(array);
    }
}
