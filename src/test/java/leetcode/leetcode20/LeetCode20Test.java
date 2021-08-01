package leetcode.leetcode20;

import leetcode.leetcode1646.LeetCode1646;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class LeetCode20Test {

    @Test
    public void generateParenthesis() {
        Logger log = Logger.getLogger("LeetCode20Test");
        LeetCode20 leet = new LeetCode20();
        leet.generateParenthesis(3);
    }
}