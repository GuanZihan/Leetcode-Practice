/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode(0);
        ListNode curNode = headNode;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                curNode.next = l1;
                l1 = l1.next;
                curNode = curNode.next;
            } else {
                curNode.next = l2;
                l2 = l2.next;
                curNode = curNode.next;
            }
        }
        if(l1 == null) {
            curNode.next = l2;
        }else {
            curNode.next = l1;
        }
        return headNode.next;
    }
}
// @lc code=end

