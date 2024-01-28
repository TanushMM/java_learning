// 2D Array
// 2D array Syntax: type[][] arrayname = new type[rows][columns];
// EG: int[][] tanush = new int[3][5];

import java.util.Scanner;

public class array2d{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //Input for number of rows and columns.
        System.out.print("Enter the Number of Rows: ");
        int rows = s.nextInt();
        System.out.print("Enter the Number of Columns: ");
        int cols = s.nextInt();

        int[][] tanush = new int[rows][cols];

        // inputs for the elements
        for (int i = 0; i < rows; i ++){
            for (int j = 0 ; j < cols; j ++){
                System.out.print("Enter the element of row " + (i+1) + " and column " + (j+1) + " :");
                tanush[i][j] = s.nextInt();
            }
        }


        //printing the elements as matrix
        for(int i =0; i <rows; i++){
            for(int j = 0; j <cols; j++){
                System.out.print(tanush[i][j]+" ");
            }
            System.out.println("");
        }
        // transpose of a matrix
        int[][] tanush1 = new int[cols][rows];
        for(int i =0; i < cols; i++){
            for(int j = 0; j<rows;j++){
                tanush1[i][j] = tanush[j][i];
            }
        }
        System.out.println(" ");
        //printing the elements as matrix
        for(int i =0; i <cols; i++){
            for(int j = 0; j <rows; j++){
                System.out.print(tanush1[i][j]+" ");
            }
            System.out.println("");
        }


        // Getting the element that needs to be searched
        // System.out.print("Enter the elements to be searched for: ");
        // int find = s.nextInt();

        // finding the element
        // for(int i =0; i < rows;i++){
        //     for(int j = 0; j < cols; j ++){
        //         if (tanush[i][j] ==  find){
        //             System.out.print("The required element is found at row "+(i+1)+" and column "+ (j+1) + ".");
        //         }
        //     }
        // }
        s.close();
    }
}