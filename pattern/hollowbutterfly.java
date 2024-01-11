package pattern;

public class hollowbutterfly {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        for(int i =1; i <=n; i++){
            for(int j = 1; j<=m;j++){
                if(i == j || j == 1 ){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            for(int j =1; j <=n;j++){
                if((i+j) == 6 || j == m ){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

        for(int i =1; i <=n ; i++){
            for(int j = 1; j <=n ;j++){
                if((i+j) == 6 || j == 1){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            for(int j = 1; j<=n;j++){
                if(i == j || j == m){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

    }
}


 
// *                 *  
// * *             * *
// *   *         *   *
// *     *     *     *
// *       * *       *
// *       * *       *
// *     *     *     *
// *   *         *   *
// * *             * *
// *                 *