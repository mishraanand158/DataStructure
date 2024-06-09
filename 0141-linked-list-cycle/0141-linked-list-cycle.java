/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if (head == null || head.next == null || head.next.next ==null)
             return false;
        
        ListNode prev = head;
        ListNode fast = head.next;
        int i = 1 ;
        while (prev != fast )
        {
            
          //  System.out.println("prev "+prev.val+ "  fast "+fast.val + " i " + i++);
            if(prev == null || fast== null || fast.next ==null){
                return false;
            }
           prev = prev.next;
           fast = fast.next.next;
        }
        
        if(prev == fast )
            return true;
        return false;
    }
}