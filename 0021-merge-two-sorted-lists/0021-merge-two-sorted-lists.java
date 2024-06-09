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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        else if(list2 ==null) 
            return list1;
        
        ListNode dummy = new ListNode(-1);
        ListNode finalNode = dummy;
        
        while(list1 != null && list2 != null){
            
            int lVal=list1.val ;
            int rVal = list2.val;
           ListNode localNode = null;
            if(lVal<=rVal){
                System.out.println("left " + lVal);
               localNode  =new ListNode(lVal);
                list1= list1.next;
            }
            else {
                 System.out.println("right " + rVal);
                localNode  =new ListNode(rVal);
                list2= list2.next;
            }
            
                finalNode.next= localNode;
                finalNode = finalNode.next ;
         
        }
        
        
        if(list1 ==null )
            while(list2 != null){
                 System.out.println("left ### " + list2.val);
                ListNode localNode = new ListNode(list2.val);
                  finalNode.next= localNode;
                list2 = list2.next;
                finalNode = finalNode.next ;
            }
        
        
        if(list2 ==null )
            while(list1 != null){
                 System.out.println("right ### " + list1.val);
                ListNode localNode = new ListNode(list1.val);
                  finalNode.next= localNode;
                list1 =list1.next;
                finalNode = finalNode.next ;
            }
    
    return dummy.next;
    }
}