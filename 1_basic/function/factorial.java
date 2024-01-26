public class factorial{
	public static int fact(int n){
		int factorial_value = 1;
		if (n == 0){
			return factorial_value;
		}
		if (n < 0){
			return 0;
		}
		for(int i =1; i<=n;i++){
			factorial_value = factorial_value * i;
		}
		return factorial_value;
	}
	public static void main(String args[]){
		int n = 5;
		System.out.println("Factorial of "+n+": "+fact(n));
	}
}
