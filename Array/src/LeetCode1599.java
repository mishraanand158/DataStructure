public class LeetCode1599 {

    /**
     * You are the operator of a Centennial Wheel that has four gondolas, and each gondola has room for up to four people. You have the ability to rotate the gondolas counterclockwise, which costs you runningCost dollars.
     * You are given an array customers of length n where customers[i] is the number of new customers arriving just before the ith rotation (0-indexed). This means you must rotate the wheel i times before the customers[i] customers arrive. You cannot make customers wait if there is room in the gondola. Each customer pays boardingCost dollars when they board on the gondola closest to the ground and will exit once that gondola reaches the ground again.
     * You can stop the wheel at any time, including before serving all customers.
     * If you decide to stop serving customers, all subsequent rotations are free in order to get all the customers down safely.
     * Note that if there are currently more than four customers waiting at the wheel, only four will board the gondola, and the rest will wait for the next rotation.
     * Return the minimum number of rotations you need to perform to maximize your profit. If there is no scenario where the profit is positive, return -1.
     * <p>
     * Input: customers = [10,9,6], boardingCost = 6, runningCost = 4
     * Output: 7
     * Explanation:
     * 1. 10 customers arrive, 4 board and 6 wait for the next gondola, the wheel rotates. Current profit is 4 * $6 - 1 * $4 = $20.
     * 2. 9 customers arrive, 4 board and 11 wait (2 originally waiting, 9 newly waiting), the wheel rotates. Current profit is 8 * $6 - 2 * $4 = $40.
     * 3. The final 6 customers arrive, 4 board and 13 wait, the wheel rotates. Current profit is 12 * $6 - 3 * $4 = $60.
     * 4. 4 board and 9 wait, the wheel rotates. Current profit is 16 * $6 - 4 * $4 = $80.
     * 5. 4 board and 5 wait, the wheel rotates. Current profit is 20 * $6 - 5 * $4 = $100.
     * 6. 4 board and 1 waits, the wheel rotates. Current profit is 24 * $6 - 6 * $4 = $120.
     * 7. 1 boards, the wheel rotates. Current profit is 25 * $6 - 7 * $4 = $122.
     * The highest profit was $122 after rotating the wheel 7 times.
     **/
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] customers = {10, 10, 6, 4, 7};
        int boardingCost = 3;
        int runningCost = 8;

        solution.minOperationsMaxProfit(customers, boardingCost, runningCost);
    }

    static class Solution {
        public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {

            int wait = 0;
            int currentProfit = 0;

            int maxProfit = Integer.MIN_VALUE;
            int round = 0;
            int total = 0;

            for (int j = 1; j <= customers.length || wait > 0; j++) {

                wait = wait + ((j - 1 < customers.length) ? customers[j - 1] : 0);
                if (wait >= 4) {
                    total += 4;
                    wait -= 4;
                } else {
                    total = total + wait;
                    wait = 0;
                }
                currentProfit = total * boardingCost - j * runningCost;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                    round = j;
                }

            }

            if (maxProfit > 0) return round;
            else return -1;
        }

    }
}