package leetcode.leetcode63;

public class LeetCode63 {
    public static void main(String[] args) {
        int[][] map = {{0,0,0},{0,1,0},{0,0,0}};
        int roads = differentRoads(map);
        System.out.println(roads);
    }
    public static int differentRoads(int[][] obstacleGrid) {
        obstacleGrid[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;

        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[i].length; j++) {
                if (i == 0 && j == 0){
                    continue;
                } else if (obstacleGrid[i][j] == 1){
                    obstacleGrid[i][j] = 0;
                }  else if (i == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i][j-1];
                } else if (j == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i-1][j];
                }else {
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                }
            }
        }
        return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length -1];
    }
}
