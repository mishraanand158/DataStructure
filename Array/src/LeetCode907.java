public class LeetCode907 {
    /**
     * Sum of Subarray Minimums
     * Given an array of integers arr, find the sum of min(b), where b ranges over every (contiguous) subarray of arr.
     * Since the answer may be large, return the answer modulo 109 + 7.
     * <p>
     * Input: arr = [3,1,2,4]
     * Output: 17
     * Explanation:
     * Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4].
     * Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.
     * Sum is 17.
     */

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3, 1, 2, 4};


        solution.sumSubarrayMins(arr);
    }

    static class Solution {

        public int sumSubarrayMins(int[] arr) {
            return 0;
        }

    }


}
