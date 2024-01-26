public class diamond {
    public static void main(String args[]){
        int n = 5;
        int number_of_line = (2*n)-1;
        int current = 1;
        int sp = n-1;
        int st = n-(n-1);

        while(current <= number_of_line){
            for(int i =1;i <= sp;i++){
                System.out.print("  ");
            }

            for(int i =1;i<=st;i++){
                System.out.print("* ");
            }
            System.out.println("");
            if (current < n){
                sp--;
                st = st + 2;
            } else if (current >= n){
                sp++;
                st = st - 2;
            }
            current++;
        }
    }
}
