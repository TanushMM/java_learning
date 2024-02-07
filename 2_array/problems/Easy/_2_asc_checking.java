public class _2_asc_checking {
    public static void main(String[] args) {
        //int[] a = {1,2,4,7};
         int[] a = {3,4,6,2};

        boolean isAscending = true;
        int size = a.length;
        for (int i =0; i < size-1; i++){
            if (a[i] > a[i+1]){
                isAscending = false;
            }
        }

        if (isAscending){
            System.out.println("Given array is in ascending order");
        } else {
            System.out.println("Given array is not in ascending order");
        }


    }
}
