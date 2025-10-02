package leetCodeQuestions;

public class maxProfit {
    public int Solution(int[] prices) {
        int sell = 0;
        int hold = Integer.MIN_VALUE;
        for(int price:prices)
        {
            sell = Math.max(sell, hold + price);
            hold = Math.max(hold,- price);
        }
        return sell;
    }


//        if(prices == null || prices.length == 0) {
//            return 0;
//        }
//
//        int minPrice = prices[0];
//        int maxProfit = 0;
//
//        for (int price : prices) {
//            minPrice = Math.min(minPrice, price);
//            maxProfit = Math.max(maxProfit, price - minPrice);
//        }
//        return maxProfit;
//    }
    public static void main(String[] args) {
        maxProfit mp = new maxProfit();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + mp.Solution(prices));  // Output: 5
    }
}
