



// THIS IS PROGRAM TO UNDERSTAND THE clearBit OPERATION OF BIT MANIPULATION 

public class clearbit {
    // CLEAR THE 2ND BIT (POSITION = 2) OF A NUMBER N TO 0
    // FOR SET BIT OPERATION 
    // BITMASK = 1<<I(POSITION)
    // OPERATION: NOT(BITMASK) THEN AND(&) WITH THE NUMBER     
    
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask  = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println("The new number is: " + newNumber);
    }
}
