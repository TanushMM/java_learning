import java.util.*;

public class boilerplate {
	public static void printHW(){
		System.out.println("Hello World");
	}

	public static int sum(int a, int b){
		int sum = a+b;
		return sum;
	}
    public static void main(String args[]) {
		for (int i =1; i < 3; i++){
			printHW();
		}
		System.out.println(sum(2,3));
    }
}
