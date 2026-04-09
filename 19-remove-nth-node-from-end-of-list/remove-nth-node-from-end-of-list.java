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
        Stack<ListNode> stack=new Stack<>();
        ListNode node=head;
        while(node!=null){
            stack.push(node);
            node=node.next;
        }
        ListNode curr=null,nextNode=null,prev=null;
        while(n!=0){
            curr=stack.pop();
            nextNode=curr.next;
            n--;
        }
        if(stack.isEmpty()){
            return nextNode;
        }
        prev=stack.pop();
        prev.next=nextNode;
        return head;
    }
}