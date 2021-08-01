package interview.interview_17_16;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class InterView_17_16Test {

    @Test
    public void massage() {
        Logger log = Logger.getLogger("InterView_17_16Test");
        int[] arr = {2,1,1,2};
        InterView_17_16 view = new InterView_17_16();
        log.info(String.valueOf(view.massage(arr)));
    }
}