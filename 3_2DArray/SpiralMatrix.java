public class SpiralMatrix {
    public static void printSpiral(int[][] matrix) {
        //start of spiral traversal
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow <= endRow && startCol <= endCol) {
            //top
            for (int i = startCol; i<=endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

            //right
            for (int i = startRow + 1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
            for (int i = endCol-1; i>=startCol; i--) {
                if (startCol == endCol) {
                    return;
                }
                System.out.print(matrix[endRow][i] + " ");
            }

            //left
            for (int i = endRow-1; i>=startRow+1; i--) {
                if (startRow == endRow) {
                    return;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for (int i =0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        printSpiral(matrix);
     }
}