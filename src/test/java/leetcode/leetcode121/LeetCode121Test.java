package leetcode.leetcode121;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class LeetCode121Test {
    Logger logger = Logger.getLogger("LeetCode1221Test");

    @Test
    public void maxProfit() {
        LeetCode121 leetCode1221 = new LeetCode121();
        int[] prices = {1,2};
        int value = leetCode1221.maxProfit(prices);
        logger.info(String.valueOf(value));
    }
}