


// THIS IS PROGRAM TO UNDERSTAND THE getBit OPERATION OF BIT MANIPULATION 

public class getbit {
    // GET THE 3RD BIT (POSITION = 2) OF A NUMBER N
    // FOR GET BIT OPERATION 
    // BITMASK = 1<<I(POSITION)
    // OPERATION: AND
    //IT RETURN A BOOLEAN VALUE

    public static void main(String args[]){
        int n = 5; // 0101
        int pos = 2; 
        int bitMask = 1<<pos ; // 0100

        if((bitMask & n) == 0){ //AND BETWEEN 0101 & 0100
            System.out.println("The bit was Zero");
        } else{
            System.out.println("The Bit was One");
        }
    }
}
