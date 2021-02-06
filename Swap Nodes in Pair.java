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
    public ListNode swapPairs(ListNode head) {
        ListNode prev=new ListNode();
        ListNode ans=prev;
        prev.next=head;
        ListNode temp;
        ListNode curr;
        curr=head;
        while(curr!=null && curr.next!=null)
        {
            temp=curr.next;
            curr.next=temp.next;
            temp.next=curr;
            prev.next=temp;
            prev=curr;
            curr=curr.next;
        }
        return ans.next;
        
    }
}