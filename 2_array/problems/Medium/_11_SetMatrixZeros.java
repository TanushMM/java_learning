public class _11_SetMatrixZeros {
    public static void setMatrixZeros(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for(int i =0; i < matrix.length; i++) {
            for(int j = 0;j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1; col[j] = 1;
                }
            }
        }
        for(int i =0; i < matrix.length; i++) {
            for(int j = 0;j < matrix[0].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for(int[] row: matrix) {
            for(int i: row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        printMatrix(matrix);
        setMatrixZeros(matrix);
        printMatrix(matrix);
    }    
}
