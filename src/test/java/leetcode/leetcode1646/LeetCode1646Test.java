package leetcode.leetcode1646;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class LeetCode1646Test {

    @Test
    public void getMaximumGenerated() {
        Logger log = Logger.getLogger("LeetCode1646Test");
        LeetCode1646 leetCode1646 = new LeetCode1646();
        log.info(String.valueOf(leetCode1646.getMaximumGenerated(3)));
    }
}