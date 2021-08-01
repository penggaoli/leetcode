package leetcode.offer_10_1;

import offer.offer_10_1.Offer_10_1;
import org.junit.Test;

import java.util.logging.Logger;

public class Offer_10_1Test {

    @Test
    public void fib() {
        Logger logger = Logger.getLogger("Offer_10_1Test");
        Offer_10_1 off = new Offer_10_1();
        logger.info(String.valueOf(off.fib(5)));
    }
}