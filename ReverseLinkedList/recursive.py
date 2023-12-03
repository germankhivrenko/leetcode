class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        return reversed_merge(None, head)

def reversed_merge(target, head):
    if not head:
        return target
    next_ = head.next
    head.next = target
    return reversed_merge(head, next_)
