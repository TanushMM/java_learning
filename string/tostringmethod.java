package string;

public class tostringmethod {
    public static void main(String args[]) {
        //  toString() belongs to string class
        int number = 123;
        String str = Integer.toString(number);
        System.out.println(str.length() + " " + str);
        // BOTH THE TOP AND THE BOTTOM STATEMENTS HAVE SAME EFFECT 
        System.out.println(str + 123); 
        
     }
  
}
