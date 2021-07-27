package leetcode.leetcode1646;

public class LeetCode1646 {
    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int [] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int maxValue = 1;

        for (int i = 2; i <= n; i++) {
            nums[i] = i % 2 == 0 ? nums[i/2] : nums[i/2] + nums[i/2 + 1];
            maxValue = Math.max(maxValue, nums[i]);
        }

        return maxValue;
    }
}
