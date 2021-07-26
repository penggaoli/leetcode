package leetcode.leetcode1575;

import java.util.Arrays;
import java.util.Calendar;
import java.util.logging.Logger;

public class LeetCode1575 {
    private static int[][] cache;
    private static Logger logger = Logger.getLogger("LeetCode175");
    public static void main(String[] args) {
//        int[] list ={2,3,6,8,4};
        int[] list ={4,3,1};
        int count = countRoutes(list,1,0,6);
        logger.info(String.valueOf(count));
    }
    public static int countRoutes(int[] locations, int start, int finish, int fuel) {
        cache = new int [locations.length][fuel+1];
        for (int i = 0; i < locations.length; i++) {
            Arrays.fill(cache[i], -1);
        }
       return countRoute(locations, start, finish, fuel);
    }

    public static int countRoute(int[] locations, int start, int finish, int fuel) {
        if (cache[start][fuel] != -1) {
            return cache[start][fuel];
        }

        if (fuel < Math.abs(locations[start] - locations[finish])) {
            cache[start][fuel] = 0;
            return cache[start][fuel];
        }
        int sum = start == finish ? 1 : 0;
        for (int i = 0; i < locations.length; i++) {
            if (i != start) {
                int need = Math.abs(locations[i]-locations[start]);
                if (fuel >= need) {
                    sum += countRoute(locations, i, finish, fuel - need);
                    sum %= 1000000007;
                }

            }
        }
        cache[start][fuel] = sum;
        return cache[start][fuel];
    }
}
