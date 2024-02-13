import java.math.*;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigInteger longRes = getNumberFromFirstNode(l1).add(getNumberFromFirstNode(l2));
        String strRes = new StringBuilder(String.valueOf(longRes)).reverse().toString();
        char[] chars = strRes.toCharArray();
        List<ListNode> list = new ArrayList<>();
        ListNode operand;
        for (int i = chars.length-1; i >= 0; i--) {
            if (i == chars.length-1) {
                operand = new ListNode(
                    Integer.valueOf(String.valueOf(chars[i]))
                );
            } else {
                operand = new ListNode(
                    Integer.valueOf(String.valueOf(chars[i])),
                    list.get(list.size()-1)
                );
            }
            list.add(operand);
        }
        return list.get(list.size()-1);
    }

    private BigInteger getNumberFromFirstNode(ListNode first) {
        String strNum = "";
        ListNode operand = first;
        while (operand != null) {
            strNum+=operand.val;
            operand = operand.next;
        }
        return new BigInteger(
            new StringBuilder(strNum).reverse().toString()
        );
    }
}