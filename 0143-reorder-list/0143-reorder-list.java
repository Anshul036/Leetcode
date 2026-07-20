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
    public void reorderList(ListNode head) {
         if (head == null || head.next == null) return ;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode present =second;
        
        while(present != null){
            ListNode next=present.next;
            present.next = prev;
            prev=present;
            present=next;
        }
        ListNode hf = head;

        while(hf != null && prev != null){
            ListNode t1 = hf.next;
            ListNode t2 = prev.next;
            hf.next = prev;
            prev.next=t1;
            
            prev=t2;
            hf=t1;
        }
      
    }
}