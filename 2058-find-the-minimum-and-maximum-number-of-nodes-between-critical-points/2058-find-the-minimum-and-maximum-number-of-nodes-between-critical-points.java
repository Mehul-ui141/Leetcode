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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int f=-1;
        int l=-1;
        int ct=0;
        int id=1;
        int min=Integer.MAX_VALUE;
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr.next != null){
            if((curr.val>prev.val && curr.val>curr.next.val) || (curr.val<prev.val && curr.val<curr.next.val)){
                if(f==-1){
                    f=id;
                    l=id;
                }
                else{
                    min=Math.min(min,id-l);
                    l=id;
                }
            }
            prev=curr;
            curr=curr.next;
            id++;
        }
        if(f==l) {
            return new int[]{-1,-1};
        }
        return new int[]{min,l-f};
    }
}