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
    public int pairSum(ListNode head) {
        ListNode s=head,f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode p=null;
        while(s!=null){
            ListNode n=s.next;
            s.next=p;
            p=s;
            s=n;
        }
        int ans=0;
        while(p!=null){
            ans=Math.max(ans,head.val+p.val);
            head=head.next;
            p=p.next;
        }
        return ans;
    }
}