class Solution {
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