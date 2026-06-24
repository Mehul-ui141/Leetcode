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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head==null || left==right) {
            return head;
        }
        ListNode c=head;
        ListNode p=null;
        int pos=1;
        while (pos<left){
            p=c;
            c=c.next;
            pos++;
        }
        ListNode lp=p;   
        ListNode ln=c;   
        p=null;
        while (pos<=right){
            ListNode next=c.next;
            c.next=p;
            p=c;
            c=next;
            pos++;
        }
        if (lp!=null) {
            lp.next=p;
        } 
        else{
            head=p;
        }
        ln.next=c;
        return head;
    }
}