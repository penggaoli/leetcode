package leetcode.leetcode5831;

public class LeetCode5831 {
    public long numberOfWeeks(int[] milestones) {
        int len = milestones.length;
        if (len == 1) {
            return 1;
        }
        long result = 0;
        long maxValue = 0;
        for (int milestone : milestones) {
            if (milestone > result) {
                if (milestone > maxValue) {
                    result += maxValue;
                    maxValue = milestone;

                } else {
                    result += milestone;

                }

            } else {
                result += milestone;
            }

            if (maxValue <= result) {
                result += maxValue;
                maxValue = 0;
            }
        }

        if (maxValue > result) {
            result = result * 2 + 1;
        }
        return result;
    }
}
