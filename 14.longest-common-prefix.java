import java.util.HashMap;

/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        HashMap<Character, Integer> count = new HashMap<>();
        for(int i = 0; i < strs.length; i ++) {
            for(int j = 0; j < strs[i].length(); j ++) {
                if(count.get(strs[i].charAt(j)) != null) {
                    count.put(strs[i].charAt(j), count.get(strs[i].charAt(j)) + 1);
                } else {
                    count.put(strs[i].charAt(j), 1);
                }
            }
        }
        String output = "";
        for(Character c: count.keySet()) {
            if(count.get(c) == strs.length) {
                output += c;
            } else {

            }
        }
        return output;
    }
}
// @lc code=end

