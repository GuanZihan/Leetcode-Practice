/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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
    public boolean isSymmetric(TreeNode root) {
        // 思路：对于每一层来说，对称要求其子节点必须对称且这一层是对称的
        if(root == null) {
            return true;
        } else {
            boolean child = false;
            if(root.left == null && root.right == null) {
                child = true;
            }
            if(root.left == null && root.right != null) {
                child = false;
            }
            if(root.left != null && root.right == null) {
                child = false;
            }
            
            if(root.left != null && root.right != null) {
                if(root.left.val == root.right.val) {
                    child = true;
                    return isSymmetric(root.left) && isSymmetric(root.right);
                } else {
                    child = false;
                }
            }

            if(child == true) {
                return true;
            } else {
                return false;
            }
        }
    }
}
// @lc code=end

