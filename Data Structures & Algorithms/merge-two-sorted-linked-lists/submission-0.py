# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        head1 = list1
        head2 = list2
        arr = []
        while head1 or head2:
            if head1:
                arr.append(head1.val)
                head1 = head1.next
            if head2:
                arr.append(head2.val)
                head2 = head2.next           
        arr.sort()
        dummy = ListNode()
        current = dummy
        for val in arr:
            current.next =  ListNode(val)
            current = current.next
        head = dummy.next
        return head

        
        

            