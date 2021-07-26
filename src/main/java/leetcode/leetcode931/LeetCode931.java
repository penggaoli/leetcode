package leetcode.leetcode931;

import java.util.logging.Logger;

public class LeetCode931 {
    private static Logger logger = Logger.getLogger("LeetCode931");

    public static void main(String[] args) {
        int[][] map = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        int min = minFallingPathSum(map);
        logger.info(String.valueOf(min));
    }

    public static int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int min = matrix[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i ==0) {
                } else if (j == 0) {
                    matrix[i][j] = Math.min(matrix[i-1][j], matrix[i-1][j+1]) + matrix[i][j];
                } else if (j == n-1) {
                    matrix[i][j] = Math.min(matrix[i-1][j], matrix[i-1][j-1]) + matrix[i][j];
                } else {
                    matrix[i][j] = Math.min(Math.min(matrix[i-1][j], matrix[i-1][j-1]), matrix[i-1][j+1]) + matrix[i][j];
                }
                if (i == m-1) {
                    min = j == 0 ? matrix[i][j] : Math.min(min, matrix[i][j]);
                }
            }
        }
        return min;
    }
}
