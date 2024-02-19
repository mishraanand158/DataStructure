/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
      long ans = 0;
        long total = 0;
long mod = 1000000007l;
    public int maxProduct(TreeNode root) {
        total = totalHelper(root);
            maxProductSum(root);   
             ans = ans%mod ;  
             int val = (int) ans;
            return val ;

    }

     private long maxProductSum(TreeNode root) {
            if (root == null)
                return 0l;

            long left = maxProductSum(root.left);
           long right = maxProductSum(root.right);
           long upperPart = total - (left + right + root.val);

            long option1 = upperPart * (left + right + root.val);
            long option2 = left * (upperPart + right + root.val);
            long option3 = right * (upperPart + left + root.val);
             
        
            ans = Math.max(ans, Math.max(option2, Math.max(option1, option3)));

            return root.val + left + right;
        }

        private long totalHelper(TreeNode root) {

            if (root == null)
                return 0l;

            return root.val + totalHelper(root.left) + totalHelper(root.right);
        }
}