public class BinaryString {
    public static void binaryString(int n, int lastPlace, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // Work
        // if (lastPlace == 0) {
        //     binaryString(n-1, 0, str+"0");
        //     binaryString(n-1, 1, str+"1");
        // } else {
        //     binaryString(n-1, 0, str + "0");
        // }
        
        // Efficient Work
        binaryString(n-1, 0, str + "0");
        if (lastPlace == 0) {
            binaryString(n-1, 1, str + "1");
        }
    }
    public static void main(String[] args) {
        binaryString(5, 0, "");
    }
}
