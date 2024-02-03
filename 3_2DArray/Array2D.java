public class Array2D {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};

        for (int[] row : array) {
            for (int column: row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }    
}
