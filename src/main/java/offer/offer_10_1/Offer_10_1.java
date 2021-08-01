package offer.offer_10_1;

public class Offer_10_1 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = (nums[i-1] + nums[i-2]) % 1000000007;
        }
        return nums[n];
    }
}
