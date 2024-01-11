package pattern;



public class pattern{
    public static void main(String args[]){

        //RECTANGLE-------------------------------------------------------------
        for(int i = 1; i < 5;i++){
            for(int j =1; j <= 5; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }


        //INVERTED LEFT TRIANGLE------------------------------------------------
        int n = 4;
        for (int i = 1; i <=4; i++){
            for (int j =1; j <=4; j++){
                if (j <= n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
            n -= 1;
        }


        //HALF TRIANGLE WITH NUMBERS------------------------------------------------
        for(int i =1; i <= 5;i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }



        //INVERTED HALF TRIANGLE WITH NUMBERS---------------------------------------
        n = 5;
        for(int i =1; i <=5 ;i++){
            for(int j =1; j<=n ;j++){
                System.out.print(j+" ");
            }
            n -= 1;
            System.out.println(" ");
        }


        //TRIANGLE WITH 1 AND 0--------------------------------------------------
        n = 5;
        for(int i =1; i <= n; i++){
            for(int j =1; j <= i; j++){
                int sum = i+j;
                if(sum % 2 == 0 ){
                    System.out.print("1 ");
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println(" ");
        }        
    }
}




//Advance pattern question 3
//         int n = 5;
//         for(int i =1; i <=n;i++){
//             int a = 9 - ((n-i) + (n-i));
//             for(int j =1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             boolean b = true;
//             for(int j = 1; j<= a; j++){
//                 if (b == true){
//                     System.out.print(i);
//                     b = false;
//                 } else{
//                     System.out.print(" ");
//                     b = true;
//                 }
//             }
//             for(int j =1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             System.out.println(" ");
//         }

// answer 3 
//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

//advance question 4
// int n = 5;
// for(int i = 1; i <= n; i++){
//     int a = 9 - ((n-i) + (n-i));
//     for(int j = 1;j <= n-i; j++){
//         System.out.print(" ");
//     }

//     for(int j =i; j>=1;j--){
//         System.out.print(j);
//     }

//     for(int j =2; j <=i;j++){
//         System.out.print(j);
//     }

//     for(int j =1; j <=n; j++){
//         System.out.print(" ");
//     }
//     System.out.println(" ");
// }

// answer 4
//     1      
//    212
//   32123
//  4321234
// 543212345
