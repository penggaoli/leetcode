package leetcode.leetcode5196;

import com.sun.glass.ui.Size;

import java.util.ArrayList;
import java.util.List;

public class LeetCode5196 {
    public int[] canSeePersonsCount(int[] heights) {
        int len = heights.length;
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(heights[len-1]);
        heights[len-1] = 0;
        for (int i = len - 2; i >= 0; i --) {
            int height = heights[i];
            nums.add(0,heights[i]);
            heights[i] = 0;
            int numsLen = nums.size();
            for (int i1 = 1; i1 < numsLen; i1++) {
                if (nums.get(i1) < height) {
                    heights[i] ++;
                    nums.remove(i1--);
                    numsLen --;
                    continue;
                }
                heights[i] ++;
                break;
            }

        }

        return heights;
    }
}