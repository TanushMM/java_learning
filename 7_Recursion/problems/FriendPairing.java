public class FriendPairing {
    public static int friendPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int single = friendPairing(n-1);
        int dual = (n-1) * friendPairing(n-2);
        return single + dual;
    }
    public static void main(String[] args) {
        System.out.println(friendPairing(3));
    }    
}
