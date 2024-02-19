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
    public List<List<Integer>> levelOrder(TreeNode root) {
      
      if(root ==null)
        return new ArrayList<>();
      
      List<List<Integer>> list =new ArrayList<>();
      
      Queue<TreeNode> queue = new LinkedList<TreeNode>();
      
      queue.add(root);
      
      while(!queue.isEmpty())
      {
        int num =queue.size();
        List<Integer> list1 = new ArrayList<Integer>();
        
        for(int i=1;i<=num;i++)
        {
        
            TreeNode node1=queue.poll();
              list1.add(node1.val);
              if(node1.left!=null)
                queue.add(node1.left);
              if(node1.right!=null)
                  queue.add(node1.right);
          
          }
        list.add(list1);
        
      }
      
      return list;
    }
  
}