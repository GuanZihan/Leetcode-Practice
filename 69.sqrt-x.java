/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
import java.lang.Math;
class Solution {
    public int mySqrt(int x) {
        double a = Math.floor(Math.sqrt(x));
        return (int)a;
    }
}
// @lc code=end

