package leetcode.leetcode121;

import sun.nio.cs.ext.MacHebrew;

public class LeetCode121 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int value = 0;
        int minValue = prices[0];
        for (int i = 0; i < len; i++) {
            value = Math.max(value, prices[i] - minValue);
            minValue = Math.min(minValue, prices[i]);
        }
        return value;
    }
}
