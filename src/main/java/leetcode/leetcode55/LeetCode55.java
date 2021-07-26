package leetcode.leetcode55;

import java.util.logging.Logger;

public class LeetCode55 {
    private static Logger logger = Logger.getLogger("LeetCode55");

    public static void main(String[] args) {
        int[] list = {3,2,1,0,4};
        logger.info(String.valueOf(canJump(list)));
    }

    public static boolean canJump(int[] nums) {
        int length = nums.length;
        nums[length-1] = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            boolean jump = false;
            if (nums[i] >= length - i -1) {
                nums[i] = 1;
                continue;
            }
            for (int i1 = 1; i1 <= nums[i]; i1++) {
                if (nums[i1 +i] == 1) {
                    nums[i]  = 1;
                    jump = true;
                    continue;
                }
            }
            if(jump) {
                continue;
            }
            nums[i] = 0;
        }
        return  nums[0] == 1;
    }
}
