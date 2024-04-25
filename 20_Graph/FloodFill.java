public class FloodFill {
    public static void dfs(int[][] image, int row, int col, int color, int start) {
        if (row < 0 || col < 0 || row >= image.length || col >= image[row].length || image[row][col] == color || image[row][col] != start) {
            return;
        }
        image[row][col] = color;

        dfs(image, row-1, col, color, start);
        dfs(image, row+1, col, color, start);
        dfs(image, row, col-1, color, start);
        dfs(image, row, col+1, color, start);
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        dfs(image, 1,1,2,image[1][1]);

        // printing
        for(int[] i : image) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
