import com.sun.source.tree.WhileLoopTree;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1593 {
    /**
     * Given a string s, return the maximum number of unique substrings that the given string can be split into.
     * You can split string s into any list of non-empty substrings, where the concatenation of the substrings forms the original string. However, you must split the substrings such that all of them are unique.
     * A substring is a contiguous sequence of characters within a string.
     * Input: s = "ababccc"
     * Output: 5
     * Explanation: One way to split maximally is ['a', 'b', 'ab', 'c', 'cc']. Splitting like ['a', 'b', 'a', 'b', 'c', 'cc'] is not valid as you have 'a' and 'b' multiple times
     */
    public static void main(String[] args) {
        Solution s1 = new Solution();
        String s = "wwwzfvedwfvhsww";
        s1.maxUniqueSplit(s);


    }

    static class Solution {
        public int maxUniqueSplit(String s) {   //wwwzfvedwfvhsww  ans 11 : w,ww,z,f,v,e,d,wf,vh,s

            Map<String, Integer> map = new HashMap<>();
            String str = "";

            for (int i = 0; i < s.length(); i++) {

                str += s.substring(i, i + 1);
                if (!map.containsKey(str)) {
                    map.put(str, i);
                    str = "";
                }

            }

            return map.size();
        }
    }
}
