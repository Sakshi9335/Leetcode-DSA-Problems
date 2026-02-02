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
    public ListNode removeNodes(ListNode head) {
        ListNode curr = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        }
        int max =0;
        head = null;
        for(int i = arr.size()-1; i>=0; i--){
            
            if(arr.get(i)>=max)
            {
                ListNode temp=new ListNode(arr.get(i));
                temp.next=head;
                head=temp;
                max=arr.get(i);
            }

        }
        return head;
    }
}