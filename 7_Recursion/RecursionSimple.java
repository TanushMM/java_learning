public class RecursionSimple {
    public static void increasingOrder(int n) {
        if (n == 0) {
            return;
        }
        increasingOrder(n-1);
        System.out.println(n);
    }
    public static void decreasingOrder(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        decreasingOrder(n-1);
    }
    public static int sumofNNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n+sumofNNaturalNumbers(n-1);
    }
    public static int factorial(int n){
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static boolean sorted(int[] array, int i) {
        if (i == array.length-1) {
            return true;
        }
        if (array[i] > array[i+1]) {
            return false;
        }
        return sorted(array, i+1);
    }
    public static int firstOccurance(int[] array, int key, int i) {
        if (i == array.length) {
            return -1;
        }
        if (array[i] == key) {
            return i;
        }
        return firstOccurance(array, key, i+1);
    }
    public static int lastOccurance(int[] array, int key, int i) {
        if (i == 0) {
            return -1;
        }
        if(array[i] == key) {
            return i;
        }
        return lastOccurance(array, key, i-1);
    }
    public static int xPowerN(int x, int n) { // O(n)
        if (n == 1) {
            return x;
        }
        return x * xPowerN(x, n-1);
    }
    public static int xPowerNOptimal(int x, int n) { // O(logn)
        if (n == 1) {
            return x;
        }
        int value = xPowerNOptimal(x, n/2);
        if (n%2 == 0) {
            return value * value;
        } else {
            return x * value * value;
        }
    }
    public static void printName(String s, int n) {
        if (n == 0) {
            return;
        }
        printName(s, n-1);
        System.out.println(s + n);
    }
    public static void main(String[] args) {
        // increasingOrder(5);
        // decreasingOrder(5);
        // System.out.println(sumofNNaturalNumbers(5));
        // System.out.println(factorial(5));
        // int[] array = {1,2,3,4,5};
        // System.out.println(sorted(array, 0));
        // System.out.println(firstOccurance(array, 4, 0));
        // System.out.println(lastOccurance(array, 4, array.length-1));
        // System.out.println(xPowerN(2,5));
        // System.out.println(fibonacci(10));
        System.out.println(xPowerNOptimal(2,10));
        // printName("Tanush", 5);



    }
}
