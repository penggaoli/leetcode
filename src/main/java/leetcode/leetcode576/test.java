package leetcode.leetcode576;

import sun.swing.plaf.synth.DefaultSynthStyle;

import javax.lang.model.element.NestingKind;
import java.util.logging.Logger;

public class test {
    private static Logger logger = Logger.getLogger("test");
    public static void main(String[] args) {
        LeetCode576 leetCode576 = new LeetCode576();
        logger.info(String.valueOf(leetCode576.findPaths(2,2,2,0,0)));
    }
}