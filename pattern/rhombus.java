package pattern;

public class rhombus {
    public static void main(String[] args) {
        int n =5;
        int m = 5;
        for(int i =1; i <=n;i++){
            for(int j =1;j <= m-1;j++){
                System.out.print("  ");
            }
            for(int j = 1; j <=n;j++){
                System.out.print("* ");
            }
            m = m-1; 
            System.out.println(" ");
        }
    }
}

//         * * * * *  
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *
