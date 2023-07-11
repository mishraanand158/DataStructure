public class LeetCode121 {
//Best Time to Buy and Sell Stock

    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * <p>
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     * <p>
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
     * Example 2:
     * <p>
     * Input: prices = [7,6,4,3,1]
     * Output: 0
     * Explanation: In this case, no transactions are done and the max profit = 0.
     */
    public static void main(String[] args) {
        LeetCode121.Solution s1 = new LeetCode121.Solution();
        int[] arr = {7,6,4,3,1};
        s1.maxProfit(arr);
    }

    static class Solution {
        public int maxProfit(int[] prices) {

            int left = 0;
            int right = prices.length - 1;
            int min = prices[left];
            int max = prices[right];

            while (left < right) {

                if (prices[left] < min) {
                    min = prices[left];
                    left++;
                } else if (prices[right] > max) {
                    max = prices[right];
                    right--;
                } else {
                    left++;
                    right--;
                }


            }
            System.out.println(max - min > -1 ? max - min : 0);
            return max - min > -1 ? max - min : 0;
        }

    }
}
