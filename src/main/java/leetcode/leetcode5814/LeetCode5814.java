package leetcode.leetcode5814;

public class LeetCode5814 {
    public int addRungs(int[] rungs, int dist) {
        int num = 0;

        int len = rungs.length;
        int maxlen = rungs[len -1];
        int index = 0;
        int next = rungs[0];
        num += (next - index -1) / dist;
        for (int i = 0; i < len; i++) {
            if (rungs[i] + dist >= maxlen){
                return num;
            }

            index = next;
            next = rungs[i+1];
            num += (next - index -1) / dist;

        }

        return num;
    }
}
