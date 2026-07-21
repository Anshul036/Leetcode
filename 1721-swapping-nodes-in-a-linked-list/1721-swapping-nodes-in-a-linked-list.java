class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int length = 0;
        ListNode cur = head;

        // Step 1: Find length
        while (cur != null) {
            length++;
            cur = cur.next;
        }

        // Step 2: Find k-th node from start
        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // Step 3: Find k-th node from end
        ListNode second = head;
        for (int i = 1; i < length - k + 1; i++) {
            second = second.next;
        }

        // Step 4: Swap values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}
