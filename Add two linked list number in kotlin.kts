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
problem
https://leetcode.com/problems/add-two-numbers/
 */
class Solution {
    fun addTwoNumbers(m1: ListNode?, m2: ListNode?): ListNode? {
        val head = ListNode(0)
        var next = head
        var modOf: Int = 0
        var l1 = m1
        var l2 = m2
        if (l1 == null && l2 == null)
            return head

        while (l1 != null && l2 != null) {
            val total: Int = l1.`val` + l2.`val` + modOf
            modOf = (total / 10).toInt()

            next.next = ListNode((total % 10).toInt())
            next = next.next

            l1 = l1.next
            l2 = l2.next
        }
        if (l1 != null) {
            next.next = l1
        }
        if (l2 != null)
            next.next = l2
        return head.next
    }
}