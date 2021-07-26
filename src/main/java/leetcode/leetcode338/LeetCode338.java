package leetcode.leetcode338;

public class LeetCode338 {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;

        for (int i = 1; i <= n; i++) {
            arr[i] = i % 2 == 1 ? arr[i/2] + 1 : arr[i/2];
        }
        return arr;
    }
}
