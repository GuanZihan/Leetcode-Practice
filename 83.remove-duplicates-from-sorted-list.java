/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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
    public ListNode deleteDuplicates(ListNode head) {
        /*
         * 链表题目思路：用单个指针做
         * 向前看而不能向后看，因为向后看一定会遍历每个Node，而这道题需要的是一步穿线，因此必须向前看。
        */
        ListNode currentNode = head;
        while(currentNode != null && currentNode.next != null) {
            // System.out.println(currentNode.val);
            if(currentNode.val != currentNode.next.val) {
                currentNode = currentNode.next;
            } else {              
                currentNode.next = currentNode.next.next;   
            }
        }
        return head;
    }
}
// @lc code=end

