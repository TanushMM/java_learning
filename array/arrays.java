
// Arrays 
// Arrays Syntas: int[] arrayname = new type[rows];
// EG: int[] tanush = new int[5];


import java.util.Scanner;

public class arrays{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//number of array items
		System.out.print("Enter the Numbers of array elements: ");
		int num = s.nextInt();
		int arr[] = new int[num];

		//storing the array values
		for (int i = 0 ; i < num; i++){
			int j = i+1;
			System.out.print("Enter the "+ j +" Element:");
			arr[i] = s.nextInt();
		}

		//getting the value that needs to be searched
		System.out.print("Enter the elemet that you need to find the index of: ");
		int search = s. nextInt();

		//Searching
		for (int i = 0; i < num ; i ++){
			int temp = arr[i];
			if (temp == search){
				System.out.print("The element that you have searched is in " +i+ " index");
			}
		}

		
		s.close();
	}
}