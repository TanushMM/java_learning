public class OddOrEven {
    public static void oddOrEven(int n) {
        if ((n & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
    public static void main(String[] args) {
        oddOrEven(1);
        oddOrEven(2);
        oddOrEven(10);
        oddOrEven(199);
    }
}