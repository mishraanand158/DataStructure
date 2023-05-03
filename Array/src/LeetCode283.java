import java.util.HashMap;
import java.util.Map;

public class LeetCode283 {

    /**
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * <p>
     * Note that you must do this in-place without making a copy of the array.
     * <p>
     * example 1:
     * <p>
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     * Example 2:
     * <p>
     * Input: nums = [0]
     * Output: [0]
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 104
     * -231 <= nums[i] <= 231 - 1
     */
    public static void main(String[] args) {
        LeetCode283.Solution s1 = new LeetCode283.Solution();

        int[] nums = {0, 1, 0, 3, 12};
        s1.moveZeroes(nums);

    }


    static class Solution {


        public void moveZeroes(int[] nums) {

            Map<Integer, Integer> map = new HashMap<>();

            for (int key : nums) {

                if (map.containsKey(key)) {

                    map.put(key, map.get(key) + 1);
                } else
                    map.put(key, 1);
            }


            int sizeZero = map.get(0);
            int j = 0;
            int i = 0;
            for (; i < nums.length - sizeZero; i++) {
                if (nums[j] == 0)
                    j++;
                else
                    nums[i] = nums[j];

                j++;

            }
            while (i < nums.length) {
                nums[i] = 0;
                i++;
            }

            for (int val : nums)
                System.out.println(val);
        }

    }
}