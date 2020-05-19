import java.util.HashMap;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> dict = new HashMap<>();
        dict.put(']', '[');
        dict.put(')', '(');
        dict.put('}', '{');

        Character[] stack = new Character[s.length()];
        int index = 0;
        for(int i = 0; i < s.length(); i ++) {
            if(index == 0&&(s.charAt(i) == ']'||s.charAt(i) ==')'||s.charAt(i) =='}')) {
                index =1;
                break;
            }
            if(s.charAt(i) == '['||s.charAt(i) =='('||s.charAt(i) =='{') {
                stack[index] = s.charAt(i);
                index ++;
            } else {
                Character reversed = dict.get(s.charAt(i));
                if(stack[index - 1].equals(reversed)) {
                    // stack[index - 1] = new Character("");
                    index --;
                } else {
                    stack[index] = s.charAt(i);
                    index ++;
                }
            }
        }
        if(index == 0) {
            return true;
        }
        return false;

    }
}
// @lc code=end

