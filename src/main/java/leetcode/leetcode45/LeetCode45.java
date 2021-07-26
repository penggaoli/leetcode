package leetcode.leetcode45;


public class LeetCode45 {
    public int jump(int[] nums) {
        int len = nums.length;
        if(len == 1) {
            return 0;
        }

        int k = 0;
        int end =0;
        int step = 0;

        for (int i = 0; i < len; i++) {
            k =Math.max(k, i+nums[i]);
            if (k >= len -1) {
                return ++step;
            }

            if (i == end) {
                step ++;
                end = k;
            }
        }
        return step;
    }
}
