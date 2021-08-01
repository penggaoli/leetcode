package lcp.lcp01;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class LCP07Test {

    @Test
    public void numWays() {
        Logger log = Logger.getLogger("LCP07Test");
        LCP07 lcp07 = new LCP07();
        int[][] arr = {{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}};
        log.info(String.valueOf(lcp07.numWays(5, arr,3)));
    }
}