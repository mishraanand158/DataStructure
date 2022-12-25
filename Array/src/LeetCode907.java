import java.util.Stack;

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
        System.out.println(solution.sumSubarrayMins(arr));
    }

    static class Solution {

        public int mod = (int) (Math.pow(10, 9) + 7);

        public int sumSubarrayMins(int[] arr) {

            Stack<Pair> leftStack = new Stack<>();
            Stack<Pair> rightStack = new Stack<>();

            int[] leftArray = new int[arr.length];
            int[] rightArray = new int[arr.length];

            int count = 1;

            for (int i = 0; i < arr.length; i++) {

                while (!leftStack.isEmpty() && leftStack.peek().value > arr[i]) {

                    count = count + leftStack.peek().count;
                    leftStack.pop();

                }
                leftArray[i] = count;
                leftStack.push(new Pair(arr[i], count));
                count = 1;
            }

            for (int i = arr.length - 1; i >= 0; i--) {

                while (!rightStack.isEmpty() && rightStack.peek().value >= arr[i]) {

                    count = count + rightStack.peek().count;
                    rightStack.pop();

                }
                rightArray[i] = count;
                rightStack.push(new Pair(arr[i], count));
                count = 1;
            }

            int result = 0;
            for (int i = 0; i < arr.length; i++) {
                result = (result + (arr[i] * leftArray[i] * rightArray[i])) % mod;
            }


            return result;
        }
    }

    static class Pair {
        int value;
        int count;

        public Pair(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }

}