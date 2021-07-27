package leetcode.interview_08_01;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Interview_08_01 {
    Logger log = Logger.getLogger("LeetCode1646");

    public int waysToStep(int n) {
        List<Long> steps = new ArrayList<Long>(3);
        steps.add(4L);
        steps.add(2L);
        steps.add(1L);
        if (n < 4) {
            return steps.get(3-n).intValue();
        }

        long value = 0;
        for (int i = 4; i <= n; i++) {
            value = (steps.get(0) + steps.get(1) + steps.get(2)) % 1000000007;
            steps.add(0, value);
            steps.remove(3);
        }

        return (int) value;
    }
}
