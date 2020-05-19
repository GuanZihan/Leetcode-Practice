
/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int base = 0;
        int nextIndex = 0;
        int retNum = 1;
        for(int i = 0; i < nums.length; i ++) {
            if(nums[base] != nums[i]) {
                nextIndex = i;
                int temp = nums[base + 1];
                nums[base + 1] = nums[nextIndex];
                nums[nextIndex] = temp;
                retNum ++;
                base += 1;
            }
        }

        // for(int i = 0; i < nums.length; i ++) {
        //     System.out.println(nums[i]);

        // }
        //     System.out.println(retNum);

        return retNum;
        

    }
}
// @lc code=end

