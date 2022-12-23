import com.sun.source.tree.WhileLoopTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
        System.out.println(s1.maxUniqueSplit(s));
        //s1.maxUniqueSplit(s);


    }

    static class Solution {
        public int maxUniqueSplit(String s) {   //wwwzfvedwfvhsww  ans 11 : w,ww,z,f,v,e,d,wf,vh,s
            return helper(s, new HashSet<>());

        }

        private int helper(String str, Set<String> set) {
            int max = 0;
            for (int i = 1; i <= str.length(); i++) {
                String candidate = str.substring(0, i);//aabcd   a , abcd

                if (!set.contains(candidate)) {
                    set.add(candidate);
                    max = Math.max(max, 1 + helper(str.substring(i), set));
                    set.remove(candidate);
                }
            }
            return max;
        }
    }
}
