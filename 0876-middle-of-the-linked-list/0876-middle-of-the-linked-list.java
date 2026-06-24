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
    public ListNode middleNode(ListNode head) {
        int ct=0;
        ListNode curr=head;
        while(curr!=null){
            ct++;
            curr=curr.next;
        }
        curr=head;
        for(int i=0;i<ct/2;i++){
            curr=curr.next;
        }
        return curr;
    }
}