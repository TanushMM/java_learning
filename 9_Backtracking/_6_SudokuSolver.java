public class _6_SudokuSolver {
    public static boolean isSafe(int[][] board, int row, int col, int digit) {
        // Column checking
        for(int i = 0; i <= 8; i++) {
            if ((board[i][col]) == digit) {
                return false;
            }
        }

        // Row checking
        for(int i = 0; i <= 8; i++) {
            if ((board[row][i]) == digit) {
                return false;
            }
        }
                                        // some error is there in the below part of the code
        // Grid checking 
        // int currentRow = (row / 3) * 3;
        // int currentCol = (col / 3) * 3;
        // for(int i = currentRow; i < currentRow + 3; i++) {
        //     for(int j = currentCol; i < currentCol + 3; j++) {
        //         if (board[i][j] == digit) {
        //             return false;
        //         }
        //     }
        // }
        return true;
    }
    public static boolean sudokuSolver(int[][] board, int row, int col) {
        // Base case
        if (row == 9) {
            return true;
        }

        // updating the row and column
        int newRow = row;
        int newCol = col + 1;
        if (col+1 == 9) {
            newRow = row+1;
            newCol = 0;
        } 

        // pass on if current place already has a number
        if (board[row][col] != 0) {
            return sudokuSolver(board, newRow, newCol);
        }

        // work to do if current place dosen't have a number
        for(int digit = 1; digit <= 9; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                if (sudokuSolver(board, newRow, newCol)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }
    public static void printSudoku(int[][] board) {
        System.out.println("-------------------");
        for(int i =0; i < board.length; i++) {
            System.out.print("|");
            for(int j =0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------------------");
    } 
    public static void main(String[] args) {
        int[][] sudoku = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };
        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exists");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution does not exists"); 
        }
    }    
}
