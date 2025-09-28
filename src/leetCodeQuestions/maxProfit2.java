/*
You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
However, you can sell and buy the stock multiple times on the same day, ensuring you never hold than one share of the stock.

Find and return the maximum profit you can achieve.
 */
package leetCodeQuestions;

public class maxProfit2 {
    public int Solution(int[] prices) {
        int maxProfit = 0;

        for ( int i = 1; i < prices.length; i++ ) {
            if ( prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        maxProfit2 mp2 = new maxProfit2();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + mp2.Solution(prices));  // Output: 7
    }
}
