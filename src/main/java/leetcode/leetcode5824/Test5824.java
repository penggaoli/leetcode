package leetcode.leetcode5824;


import java.util.logging.Logger;

public class Test5824 {
    private static Logger logger = Logger.getLogger("Test5824");

    public static void main(String[] args) {
        LeetCode5824 leetCode5824 = new LeetCode5824();
        int [] change = {6,7,9,7,4,0,3,4,4,7};
        logger.info(String.valueOf(leetCode5824.maximumNumber("214010", change)));
    }
}
