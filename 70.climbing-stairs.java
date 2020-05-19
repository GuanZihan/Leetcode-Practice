/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        /*
         * 这种迭代方法时间超了
        */
        // if(n == 1) {
        //     return 1;
        // }
        // if(n == 2) {
        //     return 2;
        // }
        //  else {
        //     return climbStairs(n - 1) + climbStairs(n - 2);
        // }

        /*
         * 动态规划方法，不需要迭代，比较耗内存
         */
        if(n == 1) {
            return 1;
        }// 因为这样dp[2]赋不了值
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i ++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
// @lc code=end

