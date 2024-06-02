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
        
        if(head==null || head.next ==null )
            return head;
        
        ListNode  prev = new ListNode(head.val);
        head  = head.next ;
        
        while(head.next !=null){
               
            ListNode  nextNode = new ListNode(head.val);    //2 
            nextNode.next = prev;
            prev = nextNode;
            head = head.next;
        }
        
        
        head.next= prev;
        
        return head;
    }
}