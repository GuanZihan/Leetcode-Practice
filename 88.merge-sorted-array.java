/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m;
        for (int i = 0; i < n; i++) {
            nums1[index] = nums2[i];
            index++;
        }

        for (int i = index - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums1[j] > nums1[i]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[i];
                    nums1[i] = temp;
                }
            }

        }
    }
}
// @lc code=end
