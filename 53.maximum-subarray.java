import java.util.ArrayList;

/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int length = nums.length;
        var leftArray = getSubArray(nums, 0, nums.length / 2);
        var rightArray = getSubArray(nums, nums.length / 2, length);

        int leftBiggest = maxSubArray(leftArray);
        int rightBiggest = maxSubArray(rightArray);
        int crossBiggest = getCrossBiggest(nums);

        if (leftBiggest > rightBiggest && leftBiggest > crossBiggest) {
            return leftBiggest;
        } else if (rightBiggest > leftBiggest && rightBiggest > crossBiggest) {
            return rightBiggest;
        } else {
            return crossBiggest;
        }

    }

    private int[] getSubArray(int[] nums, int start, int end) {
        int[] array = new int[end - start];
        int index = 0;
        for (int i = start; i < end; i++) {
            array[index] = nums[i];
            index++;
        }
        return array;
    }

    private int getCrossBiggest(int[] nums) {
        int maxSum = -99999;
        for (int j = 0; j < nums.length; j++) {
            int currentSum = 0;
            for (int i = j; i < nums.length; i++) {
                currentSum += nums[i];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
}
// @lc code=end
