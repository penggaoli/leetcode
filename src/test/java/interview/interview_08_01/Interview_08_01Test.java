package interview.interview_08_01;

import org.junit.Test;

import java.util.logging.Logger;

public class Interview_08_01Test {

    @Test
    public void waysToStep() {
        Logger log = Logger.getLogger("Interview_08_01Test");
        Interview_08_01 interview_08_01 = new Interview_08_01();
        log.info(String.valueOf(interview_08_01.waysToStep(61)));
    }
}