/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String str_num = String.valueOf(x);
        int length = str_num.length();
        int index = 0;
        while(index < length / 2) {
            if(str_num.charAt(index) != str_num.charAt(length - index - 1)) {
                return false;
            }
            index ++;
        }
        return true;
    }
}
// @lc code=end

