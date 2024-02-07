public class _1_LargestElementInAnArray {
    public static void main(String[] args) {
        int[] array = {6,3,9,5,2,7};
        // Largest element
        int largest = Integer.MIN_VALUE;
        for(int i =0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
        }
        System.out.println("Largest: "+largest);


        // second largest
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for (int i=0; i < array.length; i++) {
            large = Math.max(largest, array[i]);
            if (array[i] > secondLarge && array[i] < largest) {
                secondLarge = array[i];
            }
        }
        System.out.println("Largest: " + large);
        System.out.println("Second Largest: " + secondLarge);
    }    
}
