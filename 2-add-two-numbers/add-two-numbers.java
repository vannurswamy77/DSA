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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode dummyhead=new ListNode();
        ListNode node=dummyhead;
        int carry=0;
        while(temp1!=null && temp2!=null){
            int add=temp1.val+temp2.val+carry;
            // int value=add%10;
            ListNode nextnode=new ListNode(add%10);
            node.next=nextnode;
            node=node.next;
            temp1=temp1.next;
            temp2=temp2.next;
            carry=add/10;
        }
        while(temp1!=null){
            int add2=temp1.val+carry;
            ListNode nextnode=new ListNode(add2%10);
            node.next=nextnode;
            temp1=temp1.next;
            node=node.next;
            carry=add2/10;
        }
        while(temp2!=null){
            int add3=temp2.val+carry;
            ListNode nextnode=new ListNode(add3%10);
            node.next=nextnode;
            temp2=temp2.next;
            node=node.next;
            carry=add3/10;
        }
        if(carry!=0){
            ListNode nextnode=new ListNode(carry);
            node.next=nextnode;
        }
        return dummyhead.next;
    }
    
}