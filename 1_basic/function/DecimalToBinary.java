public class DecimalToBinary {
    public static int DTB (int decimal) {
        int copy = decimal;
        int check = 1;
        int binary = 0;
        while (copy != 0) {
            int reminder = copy % 2;
            copy = copy / 2;
            binary = binary + (reminder * check);
            check = check * 10;
        }
        return binary;
    }
    public static void main(String[] args) {
        for (int i =0;i<=7;i++) {
            System.out.println(i+": "+DTB(i));
        }
    }
}