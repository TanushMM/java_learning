public class swap{
	public static void swap_number(int a, int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Values from swap function");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	}
	public static void main(String args[]){
		int a = 5;
		int b = 10;

		swap_number(a,b);

		System.out.println("Values from main function");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	}
}
