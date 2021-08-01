package lcp.lcp01;

public class LCP07 {
    public int numWays(int n, int[][] relation, int k) {
        int [] ways = new int[n];
        ways[0] = 1;
        for (int i = 0; i < k; i++) {
            int[] next = new int[n];
            for (int[] ints : relation) {
                int from = ints[0];
                int to = ints[1];
                next[to] += ways[from];
            }
            ways = next;
        }
        return ways[n - 1];
    }
}
