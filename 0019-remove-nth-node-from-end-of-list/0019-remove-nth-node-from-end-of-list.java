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
        ListNode temp=head,prev=null;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==n) return head.next;
        temp=head;
        int i=1;
        while(i<len-n){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }
}