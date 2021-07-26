package leetcode.leetcode123;

import leetcode.leetcode122.LeetCode122;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class LeetCode123Test {
    Logger logger = Logger.getLogger("LeetCode123Test");
    @Test
    public void maxProfit() {
        LeetCode123 leetCode123 = new LeetCode123();

        int[] prices = {1,2,4,2,5,7,2,4,9,0};
        int value = leetCode123.maxProfit(prices);
        logger.info(String.valueOf(value));
    }
}