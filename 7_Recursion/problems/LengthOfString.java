public class LengthOfString {
    public static int lengthOfString(String str, int index, int length) {
        if (index == str.length()) {
            return length;
        }
        return lengthOfString(str, index+1, length+1);
    }
    public static void main(String[] args) {
        System.out.println(lengthOfString("hello",0,0));  
    }
}
