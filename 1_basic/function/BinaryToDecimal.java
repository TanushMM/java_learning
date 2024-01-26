public class BinaryToDecimal {
    public static void main(String[] args) {
        int number = 0;
        int binary = 1111011;
        int copy = binary;
        int i = 0;
        int reminder;
        while (copy != 0) {
            reminder = copy % 10;
            copy = copy / 10;
            number = number + reminder * (int) Math.pow(2,i);
            i++;
        }
        System.out.println("Decimal value of " + binary + " is: " + number);
    }
}