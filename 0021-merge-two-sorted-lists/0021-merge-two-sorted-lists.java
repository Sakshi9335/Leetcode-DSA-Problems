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
        ListNode ans = new ListNode (-1);
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode curr =  ans;
        while(curr1 != null && curr2 != null){
           if(curr1.val < curr2.val){
                curr.next = curr1;
                curr1 = curr1.next;
           }
           else {
                curr.next = curr2;
                curr2 = curr2.next;
           }
           curr = curr.next;
        }
        while(curr1 != null){
                   curr.next = curr1;
                curr1 = curr1.next;
                curr = curr.next;
           
        }
         while(curr2 != null){
                   curr.next = curr2;
                curr2 = curr2.next;
                curr = curr.next;
           
        }
        return ans.next;
        
    }
}