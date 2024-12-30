/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
        return head;
     ListNode headCopy  = head;
    ListNode current =head.next ;
    ListNode next_ ;

//&& current.next!=null
      while(current!=null ) 
      {
        next_ =current.next ;
        current.next = head;
        head = current;
        current = next_;

    }

    headCopy.next = null;

    return head;
    }
}