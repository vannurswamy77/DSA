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
    public ListNode partition(ListNode head, int x) {
        ListNode smalldummy=new ListNode();
        ListNode largedummy=new ListNode();
        ListNode small=smalldummy;
        ListNode large=largedummy;
        while(head!=null){
            if(head.val<x){
                small.next=head;
                small=small.next;
            }else{
                large.next=head;
                large=large.next;
            }
            head=head.next;
        }
        small.next=largedummy.next;
        large.next=null;
        return smalldummy.next;
    }
}