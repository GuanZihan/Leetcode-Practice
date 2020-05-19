/*
 * @lc app=leetcode id=38 lang=java
 *
 * [38] Count and Say
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        if(n == 1) {
            return "1";
        } else {
            String previous = countAndSay(n - 1);
            System.out.println(n +" " + previous);
            int count = 0;
            int lastGroup = 0;
            String retStr = "";
            int isChanged = 0;
            for(int i = 0; i < previous.length(); i ++) {
                if(previous.charAt(i) == previous.charAt(lastGroup)) {
                    count ++;
                    
                } else {
                    isChanged = 1;
                    retStr = retStr+"" + count+"" + previous.charAt(i - 1);
                    lastGroup = i;
                    count = 1;
                }
            }
            if(isChanged == 0) {
                
                return count + ""+ previous.charAt(0) + "";
            }
            return retStr + "" + count + "" + previous.charAt(previous.length() - 1);
        }
    }
}
// @lc code=end

