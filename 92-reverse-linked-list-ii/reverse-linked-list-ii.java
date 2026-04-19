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
        if(head==null || left==right){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        for(int i=1;i<left;i++){
            prev=curr;
            curr=curr.next;
        }
        ListNode shead=reverse(curr,left,right);
        if(prev!=null){
            prev.next=shead;
            return head;
        }
        return shead;
    }
    public ListNode reverse(ListNode head,int left,int right){
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummyhead=new ListNode(0);
        ListNode  curr=head;
        for(int i=0;i<=right-left;i++){
            ListNode temp=curr.next;
            curr.next=dummyhead;
            dummyhead=curr;
            curr=temp;;
        }
        head.next=curr;
        return dummyhead;
    }
}