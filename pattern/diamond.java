package pattern;

public class diamond {
    public static void main(String[] args) {
        int n = 4;
        for(int i =1; i<= n; i++){
            // spaces (First half)
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }

            // stars
            int a = 7 - ((n-i)+(n-i));
            for(int j =1; j<=a; j++){
                System.out.print("* ");
            }

            // spaces(second half)
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
            System.out.println(" ");           
        }

        for(int i =n; i>= 1; i--){
            // spaces (First half)
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }

            // stars
            int a = 7 - ((n-i)+(n-i));
            for(int j =1; j<=a; j++){
                System.out.print("* ");
            }

            // spaces(second half)
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
            System.out.println(" ");           
        }


    }
}


//       *        
//     * * *
//   * * * * *
// * * * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *
