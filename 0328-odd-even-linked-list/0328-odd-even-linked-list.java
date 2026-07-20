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
    public ListNode oddEvenList(ListNode head) {
       if(head == null || head.next == null){
        return head;
       }
       ListNode oddCurrent =head;
       ListNode evenCurrent = head.next;
       ListNode evenHead = evenCurrent;

        while(evenCurrent != null && evenCurrent.next != null){
            oddCurrent.next = evenCurrent.next;
            oddCurrent= oddCurrent.next;

            evenCurrent.next=oddCurrent.next;
            evenCurrent=evenCurrent.next;
        }
        oddCurrent.next=evenHead;
        return head;
    }
}