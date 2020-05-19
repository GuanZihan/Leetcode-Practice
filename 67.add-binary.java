/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
import java.lang.Math;
class Solution {
    public String addBinary(String a, String b) {
        //String转化成十进制int
        long int_a = 0;
        long int_b = 0;
        for(int i = 0; i < a.length(); i ++) {
            int_a += ((long)(a.charAt(i) - 48) * Math.pow(2, a.length() - i - 1));
            // System.out.println((int)a.charAt(i));

        }
        for(int i = 0; i < b.length(); i ++) {
            int_b += ((long)(b.charAt(i) - 48) * Math.pow(2, b.length() - i - 1));
        }

        //十进制加减，转化成二进制
        long sum = int_a + int_b;
        System.out.println(sum + " " + int_a + " " + int_b);

        String str = "";

        while(sum != 0) {
            str += sum % 2;
            System.out.println(str);
            sum = sum / 2;
            
        }
        

        StringBuilder sb = new StringBuilder(str);
        if(str == "") {
            return "0";
        }
        sb.reverse();
        return sb.toString();
        //输出String

    }
}
// @lc code=end

