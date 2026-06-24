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
        ListNode n=new ListNode(0);
        n.next=head;
        ListNode p=n;
        while(p.next!=null && p.next.next!=null){
            ListNode f=p.next;
            ListNode s=f.next;
            f.next=s.next;
            s.next=f;
            p.next=s;
            p=f;
        }
        return n.next;
    }
}