/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
/*
https://leetcode.com/problems/merge-two-sorted-lists/
 */
class Solution {
    fun mergeTwoLists(m1: ListNode?, m2: ListNode?): ListNode? {

        var l1 = m1
        var l2 = m2
        if (l1 == null)
            return l2
        if (l2 == null)
            return l1

        var head: ListNode? = null
        var temp = head

        while (l1 != null && l2 != null) {
            if (l1.`val` < l2.`val`) {
                if (head == null) {
                    head = l1
                    temp = l1
                } else {
                    temp?.next = l1
                    temp = temp?.next
                }
                l1 = l1.next

            } else {
                if (head == null) {
                    head = l2
                    temp = l2
                } else {
                    temp?.next = l2
                    temp = temp?.next
                }
                l2 = l2.next
            }
        }
        if (l1 != null)
            temp?.next = l1
        if (l2 != null)
            temp?.next = l2
        return head
    }
}