package leetcode.leetcode91;

import com.sun.javafx.fxml.expression.ExpressionValue;

public class LeetCode91 {
    public int numDecodings(String s) {
        int len = s.length();
        if (len == 0 || s.charAt(0) == '0') {
            return 0;
        }
        if (len == 1) {
            return 1;
        }

        int [] nums = new int[len];
        nums[0] = 1;
        int perValue = Integer.valueOf(s.substring(0, 2));
        if (perValue % 10 == 0 && perValue > 20 ){
            return 0;
        } else if (perValue % 10 == 0 || perValue > 26) {
            nums[1] = 1;
        } else {
            nums[1] = 2;
        }


        for (int i = 2; i < len; i++) {
            perValue = Integer.valueOf(s.substring(i-1, i+1));
            if (perValue == 0 || (perValue % 10 ==0 && perValue > 20)) {
                return 0;
            } else if (perValue % 10 == 0) {
                nums[i] = nums[i-2];
            }else if (perValue < 10 || perValue > 26) {
                nums [i] = nums[i-1];
            } else {
                nums[i] = nums[i-1] + nums[i-2];
            }
        }

        return nums[len-1];
    }
}
