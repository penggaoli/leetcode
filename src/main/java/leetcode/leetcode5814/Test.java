package leetcode.leetcode5814;


import java.util.logging.Logger;

public class Test {
    private static Logger logger = Logger.getLogger("Test");
    public static void main(String[] args) {
        LeetCode5814 leetCode5814 = new LeetCode5814();
        int[] rugs = {5};
        logger.info(String.valueOf(leetCode5814.addRungs(rugs, 10)));
    }
}
