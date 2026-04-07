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
        if(head==null){
            return head;
        }
        ListNode pres=head;
        ListNode futu=head.next;
        while(futu!=null){
            if(pres.val==futu.val){
                pres.next=futu.next;
                futu=futu.next;
            }else{
                pres=futu;
                futu=futu.next;
            }
        }
        return head;
    }
}