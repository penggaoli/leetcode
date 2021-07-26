package leetcode.leetcode64;

public class LeetCode64 {
    public static void main(String[] args) {
        int [][] map = {{1,2,3},{4,5,6}};
        int sum = minPathSum(map);
        System.out.println(sum);
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i ==0 && j ==0) {
                } else if (i == 0) {
                    grid[i][j] = grid[i][j-1] + grid[i][j];
                } else if (j == 0) {
                    grid[i][j] = grid[i][j] + grid[i-1][j];
                } else {
                    grid[i][j] = Math.min(grid[i-1][j], grid[i][j-1]) + grid[i][j];
                }
            }
        }
        return grid[m-1][n-1];
    }
}
