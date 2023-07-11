import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {

    // two Sum problem
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * <p>
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * <p>
     * You can return the answer in any order.
     * Example 1:
     * <p>
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * Example 2:
     * <p>
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     *
     * @param args
     */
    public static void main(String[] args) {
        LeetCode1.Solution s1 = new LeetCode1.Solution();
        int[] nums = {3, 2, 4};
        int target = 6;
        s1.twoSum(nums, target);
    }


    static class Solution {
        public int[] twoSum(int[] nums, int target) {

            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            int result[] = new int[2];

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    result[0] = i;
                    result[1] = map.get(target - nums[i]);
                    return result;
                } else {
                    map.put(nums[i], i);
                }
            }

            return result;

        }
    }
}