package leetcode.leetcode53;

public class LeetCode53 {
    public int maxSubArray(int[] nums) {
        int length = nums.length;

        int value = Integer.MIN_VALUE;

        for (int  i = 0; i < length; i ++){
            int index = 0;
            for (int j = i; j < length; j ++) {
                index += nums[j];
                value = Math.max(value, index);
            }
        }

        return value;
    }

    public int maxSubArray2(int[] nums) {
        int length = nums.length;
        int max = nums [0];
        for (int i = 1; i < length; i++) {
            nums[i] += nums[i-1] > 0 ? nums[i-1] : 0;
            max = max > nums[i] ? max : nums[i];
        }

        return max;
    }
}