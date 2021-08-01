package offer.offer_10_11;

public class Offer_10_11 {
    public int numWays(int n) {
        int[] ways = new int[101];
        ways[0] = 1;
        ways[1] = 1;
        for (int i = 2; i <= n; i++) {
            ways[i] = (ways[i - 1] + ways[i - 2]) % 1000000007;
        }
        return ways[n];
    }
}
