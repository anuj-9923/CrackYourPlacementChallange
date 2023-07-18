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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode unique=new ListNode(0);
        ListNode curr=unique, prev=head;
        int cnt=0;
        
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(prev.val==temp.next.val){
                cnt++;
            }else{
                if(cnt==0){
                    curr.next=new ListNode(prev.val);
                    curr=curr.next;
                }
                cnt=0;
                prev=temp.next;
            }
            temp=temp.next;
        }
        if(cnt==0)
            curr.next=new ListNode(prev.val);
        return unique.next;
    }
}