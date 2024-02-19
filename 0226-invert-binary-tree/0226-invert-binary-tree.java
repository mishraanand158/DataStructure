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
  
    public TreeNode invertTree(TreeNode root) {   
      if(root == null)
        return null;
      
      TreeNode left_= root.left ;
      TreeNode right_= root.right ;
      
      root.left=invertTree(right_);
      root.right=invertTree(left_ );  
      
      return root;
        
    }
}