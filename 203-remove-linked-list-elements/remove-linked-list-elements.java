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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode prev=dummy;
        ListNode node=head;
        ListNode nextNode=head.next;
        while(node.next!=null){
            if(node.val==val){
                prev.next=nextNode;
                node=nextNode;
                nextNode=nextNode.next;
            }else{
                prev=node;
                node=nextNode;
                nextNode=nextNode.next;
            }
        }
        if(node.val==val){
            prev.next=nextNode;
        }
        return dummy.next;
    }
}