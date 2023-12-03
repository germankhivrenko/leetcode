public class Solution {
    public ListNode reverseList(ListNode head) {
        return reversedMerge(null, head);
    }

    private ListNode reversedMerge(ListNode target, ListNode head) {
        if (head == null) {
            return target;
        }
        ListNode nextNode = head.next;
        head.next = target;
        return reversedMerge(head, nextNode);
    }
}
