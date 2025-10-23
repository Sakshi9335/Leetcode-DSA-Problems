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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if (head.next == null){
            return null;
        }
        int size = 0;
        ListNode Curr = head;
        while(Curr != null){
            Curr = Curr.next;
            size++;
        }
        if (n == size){
           return  head.next;
        }
        int index = size-n;
       ListNode prev = head;
        int i =1;
        while(i< index){
            prev= prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}