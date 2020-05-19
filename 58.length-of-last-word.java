/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int flag = 0;
        for(int i = 0; i < s.length(); i ++) {
            if(s.charAt(i) == ' ') {
                flag = 1;
            }
        }
        if(flag == 1 && s.length() > 1) {
            String[] a = s.split(" ");
            return a[a.length - 1].length();
        } else {
            return 0;
        }
        
    }
}
// @lc code=end

