public class _12_RotateBy90Degrees {
    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length-1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateBy90Degrees(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[0].length; j++) {
                if (i != j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for(int[] i : matrix) {
            reverse(i);
        }
    }
    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotateBy90Degrees(matrix);
        printMatrix(matrix);
    }    
}
