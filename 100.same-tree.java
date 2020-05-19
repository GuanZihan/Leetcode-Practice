/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean left = false;
        boolean right = false;
        /*
         *首先判断p和q的关系
        */
        if(p == null && q == null) {
            return true;
        }
        if(p == null && q != null) {
            return false;
        }
        if(p != null && q == null) {
            return false;
        }
        /*
         *left和right
        */
        if(p.left != null && q.left != null) {
            left = isSameTree(p.left, q.left);
        }

        if(p.left == null && q.left == null) {
            left = true;
        }

        if(p.right != null && q.right != null) {
            right = isSameTree(p.right, q.right);
        }
        
        if(p.right == null && q.right == null) {
            right = true;
        }
        if(p.val == q.val && left == true && right == true) {
            return true;
        }

        return false;

    }
}
// @lc code=end

