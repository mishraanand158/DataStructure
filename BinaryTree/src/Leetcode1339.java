class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Leetcode1339 {
    /**
     * Given the root of a binary tree, split the binary tree into two subtrees by removing one edge such that the product of the sums of the subtrees is maximized.
     * Return the maximum product of the sums of the two subtrees. Since the answer may be too large, return it modulo 109 + 7.
     * Note that you need to maximize the answer before taking the mod and not after taking it.
     * <p>
     * Input: root = [1,2,3,4,5,6]
     * Output: 110
     * Explanation: Remove the red edge and get 2 binary trees with sum 11 and 10. Their product is 110 (11*10)
     */


    public static void main(String[] args) {
        Solution s1 = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        s1.maxProduct(root);
    }

    static class Solution {

        long ans = 0;
        long total = 0;
        long mod = 1000000007l;

        public int maxProduct(TreeNode root) {
            total = totalHelper(root);
            maxProductSum(root);
            long pans = 6043763521071l;

            ans = ans % mod;
            int val = (int) ans;

            return val;
        }

        private long maxProductSum(TreeNode root) {
            if (root == null)
                return 0;

            long left = maxProductSum(root.left);
            long right = maxProductSum(root.right);
            long upperPart = total - (left + right + root.val);

            long option1 = upperPart * (left + right + root.val);
            long option2 = left * (upperPart + right + root.val);
            long option3 = right * (upperPart + left + root.val);

            ans = Math.max(ans, Math.max(option1, Math.max(option2, option3)));

            return root.val + left + right;
        }

        private long totalHelper(TreeNode root) {

            if (root == null)
                return 0;

            return root.val + totalHelper(root.left) + totalHelper(root.right);
        }
    }
}
