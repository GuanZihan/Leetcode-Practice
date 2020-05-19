import java.math.BigInteger;

/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        String num_str = String.valueOf(x);
        int index = 0;
        String retStr = "";
        if(num_str.charAt(0) == '+' || num_str.charAt(0) == '-') {
            index = 1;
        }

        int[] array = new int[num_str.length() - index];


        for(int i = index; i < num_str.length(); i ++) {
            array[i - index] = Integer.valueOf(num_str.charAt(i))-48;
        }

        for(int j = 0; j < array.length / 2; j ++) {
            int temp = array[j];
            array[j] = array[array.length - j - 1];
            array[array.length - j - 1] = temp;
        }

        if(index == 1) {
            retStr += num_str.charAt(0);
        }

        for(int k = 0; k < array.length; k ++) {
            retStr += String.valueOf(array[k]);
        }

        long ret = Long.parseLong(retStr);
        int retint = (int)ret;
        if(ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE) {
            retint = 0;
        }
        
        return retint;
    }

    // public static void main(String[] args) {
    //     int x = new Solution().reverse(120);
    //     System.out.println(x);
    // }
}
// @lc code=end

