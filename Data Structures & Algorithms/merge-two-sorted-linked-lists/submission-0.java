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
        ListNode curr1=list1.head;
        ListNode curr2=list2.head;
        ListNode<Integer> ll=new ListNode<>();
        while(curr1!=null&& curr2!=null){
            if(curr1>curr2){
                 ll.add(curr1);
                 curr1=curr1.next;}
            else {
                ll.add(curr2);
                 curr2=curr2.next;}

        }

        return ll;

        
    }
}