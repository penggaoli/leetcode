package leetcode.leetcode122;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class LeetCode122Test {
    Logger logger = Logger.getLogger("LeetCode1221Test");
    @Test
    public void maxProfit() {
        LeetCode122 leetCode122 = new LeetCode122();

        int[] prices = {1,2,3,4,5};
        int value = leetCode122.maxProfit(prices);
        logger.info(String.valueOf(value));
    }
}