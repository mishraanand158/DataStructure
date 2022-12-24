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
        int[] customers = {3, 4, 0, 5, 1};
        int boardingCost = 1;
        int runningCost = 92;

        solution.minOperationsMaxProfit(customers, boardingCost, runningCost);
    }

    static class Solution {
        public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {

            int wait = 0;
            int profit = 0;
            int total = 0;
            int i = 1;

            for (int customer : customers) {


                if (customer > 4 || wait + customer > 4) {
                    total = total + 4;
                } else {
                    total += customer;
                    total = total + wait;
                }
                profit = total * boardingCost - i * runningCost;
                wait = wait + customer - 4;
                if (wait < 0)
                    wait = 0;
                i++;
            }


            while (wait > 0) {
                if (wait >= 4) {
                    total = total + 4;
                    wait = wait - 4;
                    profit = total * boardingCost - i * runningCost;
                    i++;
                } else {
                    total = total + wait;
                    profit = total * boardingCost - i * runningCost;
                    wait = wait - 4;
                    i++;
                }

            }
            if (profit > 0)
                return i - 1;
            else
                return -1;
        }

    }
}