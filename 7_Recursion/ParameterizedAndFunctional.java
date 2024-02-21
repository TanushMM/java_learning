public class ParameterizedAndFunctional {
    public static void parameterized(int n, int sum) { 
        /*
         * parameterized recursion prints something and dosen't
         * return anything 
         */
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        parameterized(n-1, sum+n);
    }

    public static int functional(int n, int sum) {
        /*
         * functional recursion returns something and dosen't
         * print anything
         */
        if (n == 0) {
            return sum;
        }
        return functional(n-1, sum+n);
    }
    public static void main(String[] args) {
        parameterized(5, 0);
        System.out.println(functional(5, 0));
    }    
}
