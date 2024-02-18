public class Main {
    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if ((n & bitMask) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit (n,i);
        }
    }
    public static int updateLastIBits(int n, int i) {
        int bitMask = -1<<(i+1);
        return n & bitMask;
    }
    public static int clearRangeBits(int n, int i, int j) {
        // need to complete
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(5,2));
        System.out.println(setIthBit(5,2));
        System.out.println(clearIthBit(5,2));
        System.out.println(updateIthBit(5,1,1));
        System.out.println(updateLastIBits(5,2));

    }
}