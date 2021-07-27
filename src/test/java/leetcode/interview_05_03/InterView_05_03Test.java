package leetcode.interview_05_03;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class InterView_05_03Test {

    @Test
    public void reverseBits() {
        Logger log = Logger.getLogger("InterView_05_03Test");
        InterView_05_03 interView_05_03 = new InterView_05_03();
        log.info(String.valueOf(interView_05_03.reverseBits(-1)));
    }
}