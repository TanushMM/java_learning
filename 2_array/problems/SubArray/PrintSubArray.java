public class PrintSubArray {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};
        int total = 0;

        for (int i =0; i< array.length; i++) {
            for (int j = i; j<array.length;j++) {
                for (int k = i; k<=j ;k++) {
                    System.out.print(array[k]+" ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays: " + total);
        //total = [n(n+1)]/2
    }   
}
