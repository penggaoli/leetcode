package leetcode.leetcode1289;

import java.util.logging.Logger;

public class LeetCode1289 {
    private static Logger logger = Logger.getLogger("LeetCode1289");
    public static void main(String[] args) {
        int [][] map = {
                {-73,61,43,-48,-36},
                {3,30,27,57,10},
                {96,-76,84,59,-15},
                {5,-49,76,31,-7},
                {97,91,61,-46,6}};
        int min = minFallingPathSum(map);
        logger.info(String.valueOf(min));
    }

    public static int minFallingPathSum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int min = Integer.MAX_VALUE;
        int value = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                value = arr[i][j];
                arr[i][j] = Integer.MAX_VALUE;
                for (int k = 0; k < n; k ++) {
                    if (k != j) {
                        arr[i][j] = Math.min(arr[i][j], value + arr[i-1][k]);
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[m-1][i]);
        }
        return min;
    }
}
