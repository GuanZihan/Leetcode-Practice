#
# @lc app=leetcode id=66 lang=python3
#
# [66] Plus One
#
import math
# @lc code=start
class Solution:
    """
    这种方法太菜了，以后改进
    """
    def plusOne(self, digits):
        if digits[len(digits) - 1] != 9:
            digits[len(digits) - 1] += 1
        else:
            digits[len(digits) - 1] = 0
            if(len(digits) - 1 > 1):
                digits[0: len(digits) - 1] = self.plusOne(digits[0: len(digits) - 1])
            else:
                digits.insert(0,0)
                digits[0: len(digits) - 1] = self.plusOne(digits[0: len(digits) - 1])

        if(digits[0] == 0):
            digits.pop(0)
        return digits

# @lc code=end

