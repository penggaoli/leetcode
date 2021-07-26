package leetcode.leetcode746;

public class LeetCode746 {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] cost1 = new int[len+1];
        cost1[0] = 0;
        cost1[1] = 0;

        for (int i = 2; i < len+1; i++) {
            cost1[i] = Math.min(cost[i - 1] + cost1[i - 1], cost[i - 2] + cost1[i - 2]);
        }

        return cost1[len];
    }
}
