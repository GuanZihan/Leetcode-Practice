import java.util.HashMap;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> dict = new HashMap<>();
        dict.put("I", 1);
        dict.put("V", 5);
        dict.put("X", 10);
        dict.put("L", 50);
        dict.put("C", 100);
        dict.put("D", 500);
        dict.put("M", 1000);
        dict.put("IV", 4);
        dict.put("IX", 9);
        dict.put("XL", 40);
        dict.put("XC", 90);
        dict.put("CD", 400);
        dict.put("CM", 900);

        int retNum = 0;
        int windowSize = 1;
        int index = 0;
        while(index < s.length()) {
            if(index == s.length() - 1) {
                windowSize = 0;
            }
            if(dict.get(s.charAt(index)+"" + s.charAt(index + windowSize))!= null) {
                retNum += dict.get(s.charAt(index)+""+ s.charAt(index + windowSize));
                index += 2;

            } else if(dict.get(s.charAt(index)+"")!= null) {
                retNum += dict.get(s.charAt(index)+"");
                index += 1;
            }

        }


        return retNum;
    }
}
// @lc code=end

