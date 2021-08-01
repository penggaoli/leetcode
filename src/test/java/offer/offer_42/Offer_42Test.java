package offer.offer_42;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class Offer_42Test {

    @Test
    public void maxSubArray() {
        Logger log = Logger.getLogger("Offer_42Test");

        Offer_42 off = new Offer_42();
        int[] arr = {-1};
        log.info(String.valueOf(off.maxSubArray(arr)));
    }
}