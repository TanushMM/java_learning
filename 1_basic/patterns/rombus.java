public class rombus {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <=n;i++){
            for (int j = 1; j<= 4;j++){
                if (i+j <= n+1){
                    System.out.print("  ");
                }
            }
            for (int j =0;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
