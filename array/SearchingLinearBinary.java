public class SearchingLinearBinary{
    public static boolean condition = true;
    public static void printarray(int array[]){
        for(int i =0 ; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
    public static int search_binary(int array[], int number, int beg, int end){

        int middle = (end + beg) / 2 ;
        //int middle = mid + (ending-beginning)/2;
        
        for(int i =beg ; i <= end; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        while (condition == true){
            if(number > array[middle]){
                beg = middle;
                search_binary(array, number, beg, end);
            } else if(number < array[middle]){
                int endi = middle;
                System.out.println("hello");
                System.out.println(endi);
                search_binary(array, number, beg, endi);
            } else if(number == array[middle]){
                System.out.println("Element found");
                condition = false;
            } else {
                System.out.println("Element not found");
                condition = false;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        int array[] = {2, 10, 34, 46, 51, 59, 68, 68, 97, 98};
        int len = (array.length) - 1;
        search_binary(array,34,0,len);


    }
}