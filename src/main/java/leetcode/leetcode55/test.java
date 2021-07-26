package leetcode.leetcode55;

import java.util.logging.Logger;


public class test {
    private static Logger logger = Logger.getLogger("LeetCode55");

    public static void main(String[] args) {
        LeetCode55_1 leetCode55_1 = new LeetCode55_1();

        int[] list = {2,3,1,1,4};
        logger.info(String.valueOf(leetCode55_1.canJump(list)));
    }
}
