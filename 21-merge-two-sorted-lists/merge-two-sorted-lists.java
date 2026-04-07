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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      if(list1==null && list2==null){
        return null;
      }  
      ListNode dummy=new ListNode();
      ListNode temp3=dummy;
      ListNode temp1=list1;
      ListNode temp2=list2;
      while(temp1!=null && temp2!=null){
        if(temp1.val>=temp2.val){
            temp3.next=temp2;
            temp3=temp3.next;
            temp2=temp2.next;
        }else{
            temp3.next=temp1;
            temp3=temp3.next;
            temp1=temp1.next;
        }
      }
      if(temp1!=null && temp2==null){
        temp3.next=temp1;
      }
      if(temp2!=null && temp1==null){
        temp3.next=temp2;
      }
      return dummy.next;
    }
}