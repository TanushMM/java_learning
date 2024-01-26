public class prime_or_not {
    public static boolean prime(int n){
        if (n <=0){
            return false;
        }
        for (int i=2;i<n;i++){ // use i<sqrt(n) to have a more optimized result
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(prime(n));
    }
}
