package leetcode.leetcode45;

import java.util.logging.Logger;

public class Test {
    private static Logger logger = Logger.getLogger("Test");

    public static void main(String[] args) {
        LeetCode45 le = new LeetCode45();
        int[] list = {2,1,1,1,1};
        logger.info(String.valueOf(le.jump(list)));
    }
}
