public class CharacterCaseChanging {
    public static void main(String[] args) {
        char c = 'A';
        /*
         * ascii of A = 65
         * ascii of a = 97
         */
        System.out.println((char)(c | 32)); // you can use 32 or ' ' because whitespace also has the same value of 32 in ASCII

        c = 'a';
        System.out.println((char)(c & ~(32)));
        /*
         * here were setting the 6 th bit from left to 0 so 
         * in terms of binary the number 97 automatically changes to 65
         */
    }
}
