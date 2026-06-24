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
    public boolean isPalindrome(ListNode head) {
        ListNode s=head,f=head,prev,t;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        prev=s;
        s=s.next;
        prev.next=null;
        while(s!=null){
            t=s.next;
            s.next=prev;
            prev=s;
            s=t;
        }
        f=head;
        s=prev;
        while(s!=null) {
            if(f.val!=s.val){
                return false;
            } 
            f=f.next;
            s=s.next;
        }
        return true;
    }
}