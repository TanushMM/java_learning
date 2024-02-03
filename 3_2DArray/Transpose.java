public class Transpose {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0 ; i< matrix.length; i++) {
            for (int j = 0 ; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transposeArray = new int[col][row];

        for (int i =0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposeArray[j][i] = matrix[i][j];
            }
        }
        printMatrix(transposeArray);
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2},{3,4},{5,6}};
        printMatrix(matrix);
        transposeMatrix(matrix);
    }
}