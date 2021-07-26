package leetcode.leetcode123;

import javafx.collections.transformation.SortedList;

import java.util.SortedSet;

public class LeetCode123 {
    public int maxProfit(int[] prices) {
       int firstBuy = Integer.MIN_VALUE;
       int firstSell = 0;
       int secondBuy = Integer.MIN_VALUE;
       int secondSell = 0;

        for (int price : prices) {
            firstBuy = Math.max(firstBuy, -price);
            firstSell = Math.max(firstSell, firstBuy + price);
            secondBuy = Math.max(secondBuy, firstSell-price);
            secondSell = Math.max(secondSell, secondBuy + price);
        }

        return secondSell;
    }
}
