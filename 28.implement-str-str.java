/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Implement strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        
        if (m == 0 || haystack.equals(needle)) {
            return 0;
        }
        if(m > n) {
            return -1;
        }
        for(int i = 0; i < n - m + 1; i ++) {
            if(haystack.substring(i, m + i).equals(needle)) {
                return i;
            }
        }
        return -1;

    }
}
// @lc code=end
