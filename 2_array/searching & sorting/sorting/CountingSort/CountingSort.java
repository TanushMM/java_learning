public class CountingSort {
    public static void countingSortAscending(int[] array) {
        // Maximum element 
        int maximum = Integer.MIN_VALUE;
        for(int i =0; i < array.length; i++) {
            maximum = Math.max(maximum, array[i]);
        }

        // Count array or frequency array
        int[] count = new int[maximum+1];
        for(int i =0; i < array.length; i++) {
            count[array[i]]++;
        }

        //sorting
        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void countingSortDescending(int[] array) {
        // Maximum element 
        int maximum = Integer.MIN_VALUE;
        for(int i =0; i < array.length; i++) {
            maximum = Math.max(maximum, array[i]);
        }

        // Count array or frequency array
        int[] count = new int[maximum+1];
        for(int i =0; i < array.length; i++) {
            count[array[i]]++;
        }

        // sorting
        int j = 0;
        for(int i = count.length-1; i >= 0; i--) {
            while(count[i] > 0) {
                array[j] =i;
                j++;
                count[i]--;
            }
        }
    }


    public static void printArray(int[] array) {
        for(int i =0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {1,4,1,3,2,4,3,7};
        printArray(array);

        countingSortAscending(array);

        printArray(array);

        countingSortDescending(array);

        printArray(array);
    }    
}
