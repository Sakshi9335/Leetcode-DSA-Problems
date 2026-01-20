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
          ListNode curr1 = l1;
        ListNode curr2 = l2;
        int carry = 0;
        int sum = curr1.val + curr2.val + carry;
        carry = sum / 10;
        ListNode ans = new ListNode(sum % 10);
        curr1 = curr1.next;
        curr2 = curr2.next;
        ListNode curr = ans;
        while (curr1 != null && curr2 != null) {
            sum = curr1.val + curr2.val + carry;
            ListNode newnode = new ListNode(sum % 10);
            carry = sum / 10;
            curr.next = newnode;
            curr = newnode;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        while (curr1 != null) {
            sum = curr1.val + carry;
            ListNode newnode = new ListNode(sum % 10);
            carry = sum / 10;
            curr.next = newnode;
            curr = newnode;
            curr1 = curr1.next;

        }
        while (curr2 != null) {
            sum = curr2.val + carry;
            ListNode newnode = new ListNode(sum % 10);
            carry = sum / 10;
            curr.next = newnode;
            curr = newnode;
            curr2 = curr2.next;
        }

        if (carry != 0) {
            ListNode newnode = new ListNode(carry);
            curr.next = newnode;
            curr = curr.next;
        }

        curr.next = null;

        return ans;

    }
}