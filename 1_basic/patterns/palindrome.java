public class palindrome {
    public static void main(String args[]) {
        int n = 5;
        int number_of_line = 5;
        int current = 1;
        int sp = n-1;
        int st = 1;
        int temp;

        while (current <= number_of_line){
            temp = current;
            for(int i=1;i<=sp;i++){
                System.out.print(" ");
            }
            for(int i=1;i<=st/2+1;i++){
                if(temp>=1){
                    System.out.print(temp);
                    temp--;
                }
            }
            for(int i=1;i<=st/2;i++){
                if (temp >= 0) {
                    System.out.print(temp+2);
                    temp++;
                }
            }
            
            

            
            st = st + 2;
            sp--;
            current++;
            System.out.println();
        }
    }
}
