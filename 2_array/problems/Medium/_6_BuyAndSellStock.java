public class _6_BuyAndSellStock {
    public static void buyAndSellStock(int[] array) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i =0; i < array.length; i++) {
            if (array[i] > buyPrice) {
                int profit = array[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = array[i];
            }
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args) {
        int[] array = {7,2,5,3,8,1,2};  //7,1,5,3,6,4
        buyAndSellStock(array);
    }    
}
