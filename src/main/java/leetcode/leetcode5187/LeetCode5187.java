package leetcode.leetcode5187;

public class LeetCode5187 {
    public long minimumPerimeter(long neededApples) {
        long ivalue  = 0;
        long i = 0;
        while (ivalue < neededApples) {
            i ++;
            ivalue += 12*i*i;
        }
        return 8*i;
    }
}
