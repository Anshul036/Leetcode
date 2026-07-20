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
        ListNode temp =new ListNode(0);
        temp.next=head;
        ListNode temp1 =temp;
        ListNode temp2= head;
        for(int i=0;i<n;i++){
            temp2 = temp2.next;
        }
        while(temp2 != null){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        temp1.next=temp1.next.next;
        return temp.next;
    }
}