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
        ListNode p=null;
        ListNode c=head;
        while(c!=null){
            ListNode n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
}