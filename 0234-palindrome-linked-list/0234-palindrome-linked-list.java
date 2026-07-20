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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        if (fast != null) {
            slow = slow.next;
        }

        ListNode prev = null;
        ListNode present =slow;
        
        while(present != null){
            ListNode next=present.next;
            present.next = prev;
            prev=present;
            present=next;
        }
        ListNode temp = head;
        while(temp != null && prev != null){
            if(temp.val!=prev.val){
                return false;
            }
            prev = prev.next;
            temp = temp.next;

        }

        return true;

    }
}