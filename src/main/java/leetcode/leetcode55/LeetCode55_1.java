package leetcode.leetcode55;

public class LeetCode55_1 {
    public boolean canJump(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        int awer =0;
        for(int i =0; i<=awer;i++) {
            awer = Math.max(awer, nums[i] + i);
            if (awer >= nums.length -1){
                return true;
            }
        }
        return false;
    }
}
