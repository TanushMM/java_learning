package string;

public class reversethestring {
    public static void main(String args[]){
        StringBuilder tanush = new StringBuilder("hello");

        int len = tanush.length();
        StringBuilder tanush1 = new StringBuilder("");

        for(int i =len-1; i >=0; i--){
            tanush1.append(tanush.charAt(i));
        }
        System.out.print(tanush1);
    }
}
