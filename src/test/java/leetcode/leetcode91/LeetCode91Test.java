package leetcode.leetcode91;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class LeetCode91Test {

    @Test
    public void numDecodings() {
        Logger log = Logger.getLogger("LeetCode91Test");
        LeetCode91 leet = new LeetCode91();
        log.info(String.valueOf(leet.numDecodings("226")));
    }
}