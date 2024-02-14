import java.util.*;
public class _13_SpiralMatrix {
    public static void spiralMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length -1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for(int i = startCol; i <= endCol; i++) {
                list.add(matrix[startRow][i]);
            }

            // right
            for(int i = startRow+1; i <= endRow; i++) {
                list.add(matrix[i][endCol]);
            }

            // bottom
            for(int i = endCol-1; i >= startCol; i--){
                if (startRow == endRow) {
                    break;
                }
                list.add(matrix[endRow][i]);
            }

            // left
            for(int i = endRow-1; i >= startRow+1; i--) {
                if (startCol == endCol) {
                    break;
                }
                list.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        for(int i : list) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        // int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
        spiralMatrix(matrix);

    }
}
