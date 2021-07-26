package leetcode.leetcode122;

public class LeetCode122 {
    public int maxProfit(int[] prices) {
        int value = 0;
        int minPrice = prices[0];
        int maxPrice = prices[0];

        int len = prices.length;
        for (int i = 0; i < len; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            } else {
                value += maxPrice - minPrice;
                maxPrice = prices[i];
                minPrice = prices[i];
            }
        }
        value += maxPrice - minPrice;
        return value;
    }
}
