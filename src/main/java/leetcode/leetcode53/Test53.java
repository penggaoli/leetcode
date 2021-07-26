package leetcode.leetcode53;


import java.util.logging.Logger;

public class Test53 {
    private static Logger logger = Logger.getLogger("Test53");

    public static void main(String[] args) {
        LeetCode53 leetCode53 = new LeetCode53();
        int[] list = {-2,1,-3,4,-1,2,1,-5,4};
        logger.info(String.valueOf(leetCode53.maxSubArray2(list)));
    }
}
