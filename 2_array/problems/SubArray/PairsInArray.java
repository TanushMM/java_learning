public class PairsInArray {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};
        int total = 0;
        for (int i =0; i < array.length-1;i++) {
            for (int j = i+1; j<array.length; j++) {
                System.out.print("("+array[i]+",");
                System.out.print(array[j]+")");
                System.out.print(" ");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + total);
        //total = [n(n-1)]/2
    }
}
