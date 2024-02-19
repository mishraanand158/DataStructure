class Solution {
    public int maxUniqueSplit(String s) {
        
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
