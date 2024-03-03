public class _5_GridWays {
    public static int gridWays(int i, int j, int n, int m) {
        if (i == n-1 && j == m-1) {
            return 1;
        }
        if (i == n || j == m) {
            return 0;
        }
        return gridWays(i+1, j, n, m) + gridWays(i, j+1, n, m);
    }
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
        /* 
         * Optimal way using permutations formula 
         * Total Permutations = (n-1+m-1)! / (n-1)! * (m-1)!
         */
        System.out.println(factorial(n-1+m-1) / (factorial(n-1) * factorial(m-1)));
    }    
}
