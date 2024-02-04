public class DiagonalSum {
    public static void bruteForceDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0 ; i < matrix.length; i++) {
            for (int j = 0 ; j < matrix[0].length; j++) {
                if (i == j) { // primary diagonal
                    sum += matrix[i][j];
                } else if ((i+j) == matrix.length - 1) { // secondary diagonal
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal (Brute Force): " + sum);
    }   

    public static void optimalDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // primary diagonal
            sum += matrix[i][i];

            //secondary diagonal
            // i+j = n-1
            // j = n-1-i
            if (i != matrix.length-1-i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println("Sum of diagonal (Optimal): " + sum);
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        bruteForceDiagonalSum(matrix);
        optimalDiagonalSum(matrix);
    }
}