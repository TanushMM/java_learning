
public class max_of_3_numbers{
    public static void main(String args[]){
        int a,b,c;
        a = 100;
        b=40;
        c=30;
        if (a>b){
            if (a>c){
                System.out.println("a is the largest number");
            } else {
                System.out.println("c is the largest number");
            }
        } else if (b>c){
            System.out.println("b is the largest number");
        } else {
            System.out.println("c is the largest number");
        }
    }
}