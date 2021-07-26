package leetcode.leetcode5815;

import java.util.logging.Logger;

public class LeetCode5815 {
    public long maxPoints(int[][] points) {
        if (null == points || points.length < 1) {
            return 0;
        }

        int row = points.length;
        int len = points[0].length;
        long[][] zui = new long[row][len];
        for (int i = 0; i < len; i++) {
            zui[0][i] = points[0][i];
        }
        for (int i = 1; i < row; i++) {

            for (int j = 0; j < len; j++) {
                long value = points[i][j];
                for (int k = 0; k < len; k++) {
                    value = Math.max(value, points[i][j] + zui[i - 1][k] - Math.abs(j - k));
                }
                zui[i][j] = value;
            }
        }

        long max = points[row - 1][0];
        for (int i = 1; i < len; i++) {
            max = Math.max(max, zui[row - 1][i]);
        }

        return max;
    }

    public static class Test1 {
        private static Logger logger = Logger.getLogger("Test5196");

        public static void main(String[] args) {
            logger.info(String.valueOf(111));
        }
    }
}
