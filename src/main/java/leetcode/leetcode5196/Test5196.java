package leetcode.leetcode5196;

import java.util.logging.Logger;

public class Test5196 {
    private static Logger logger = Logger.getLogger("Test5196");

    public static void main(String[] args) {
        LeetCode5196 leetCode5196 = new LeetCode5196();
        int [] arr = {10,6,8,5,11,9};
        logger.info(String.valueOf(leetCode5196.canSeePersonsCount(arr)));
    }
}
