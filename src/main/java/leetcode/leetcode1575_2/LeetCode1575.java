package leetcode.leetcode1575_2;

import java.util.logging.Logger;

/**
 * 给你一个 互不相同 的整数数组，其中 locations[i] 表示第 i 个城市的位置。同时给你 start，finish 和 fuel 分别表示出发城市、目的地城市和你初始拥有的汽油总量

 每一步中，如果你在城市 i ，你可以选择任意一个城市 j ，满足  j != i 且 0 <= j < locations.length ，并移动到城市 j 。从城市 i 移动到 j 消耗的汽油量为 |locations[i] - locations[j]|，|x| 表示 x 的绝对值。

 请注意， fuel 任何时刻都 不能 为负，且你 可以 经过任意城市超过一次（包括 start 和 finish ）。

 请你返回从 start 到 finish 所有可能路径的数目。

 由于答案可能很大， 请将它对 10^9 + 7 取余后返回。

 作者：宫水三叶
 链接：https://leetcode-cn.com/leetbook/read/path-problems-in-dynamic-programming/r82ix6/
 来源：力扣（LeetCode）
 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */

public class LeetCode1575 {
    private static Logger logger = Logger.getLogger("LeetCode1575");

    public static void main(String[] args) {
//        int[] list ={4,3,1};
        int[] list = {1,2,3};
        int count = countRoutes(list,0,2,40);
        logger.info(String.valueOf(count));
    }

    public static int countRoutes(int[] locations, int start, int finish, int fuel) {
        int n = locations.length;

        int[][] cache = new int[n][fuel+1];

        for (int i = 0; i <= fuel; i++) {
            cache[finish][i] = 1;
        }

        for(int i = 0; i <= fuel; i ++) {
            for (int j =0;j<n;j++) {
                for (int k = 0; k<n;k ++){
                    if (j != k) {
                        int need = Math.abs(locations[j] - locations[k]);
                        if (i >= need) {
                            cache[j][i] += cache[k][i-need];
                            cache[j][i] %= 1000000007;
                        }
                    }
                }
            }
        }

        return cache[start][fuel];
    }
}
