// THIS IS PROGRAM TO UNDERSTAND THE setBit OPERATION OF BIT MANIPULATION 
public class setbit {
    // SET THE 2ND BIT (POSITION = 1) OF A NUMBER N TO 1 
    // FOR SET BIT OPERATION 
    // BITMASK = 1<<I(POSITION)
    // OPERATION: OR

    public static void main(String[] args) {
        int n = 5; // 0101
        int pos= 1;
        int bitMask = 1<<pos;
        int newNumber = bitMask|n;
        System.out.println("New Number: "+newNumber);
    }
}
