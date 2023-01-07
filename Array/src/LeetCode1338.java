import java.util.Map;
import java.util.TreeMap;

public class LeetCode1338 {

    /**
     * You are given an integer array arr. You can choose a set of integers and remove all the occurrences of these integers in the array.
     * Return the minimum size of the set so that at least half of the integers of the array are removed.
     * <p>
     * Input: arr = [3,3,3,3,5,5,5,2,2,7]
     * Output: 2
     * Explanation: Choosing {3,7} will make the new array [5,5,5,2,2] which has size 5 (i.e equal to half of the size of the old array).
     * Possible sets of size 2 are {3,5},{3,2},{5,2}.
     * Choosing set {2,7} is not possible as it will make the new array [3,3,3,3,5,5,5] which has a size greater than half of the size of the old array.
     */
    public static void main(String[] args) {
        Solution s1 = new Solution();

        int[] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        s1.minSetSize(arr);
    }

    static class Solution {
        public int minSetSize(int[] arr) {
            Map<Integer, Integer> map = new TreeMap<>();

            int max = 1;

            for (int val : arr) {

                if (map.containsKey(val)) {
                    int value = map.get(val) + 1;
                    if (value > max)
                        max = value;
                    map.put(val, value);
                } else {
                    map.put(val, 1);
                }
            }
            System.out.println(map);

            int halfSize = arr.length / 2;
            System.out.println(halfSize);
            if (map.size() == 1)
                return 1;


            return 0;
        }
    }
}
