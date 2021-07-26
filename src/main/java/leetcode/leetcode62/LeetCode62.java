package leetcode.leetcode62;


public class LeetCode62 {
    public static void main(String[] args) {
        int roads = differentRoad(1, 2);
        System.out.println(roads);
    }

    private static int differentRoad(int m, int n) {
        int[][] map = new int[m + 1][n + 1];
        map[1][0] = 1;
        map[0][1] = 1;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    map[i][j] = 1;
                    continue;
                }
                map[i][j] = map[i-1][j] + map[i][j-1];
            }
        }

        return map[m-1][n-1];
    }
}


