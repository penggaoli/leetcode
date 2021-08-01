package leetcode.leetcode5830;

public class LeetCode5830 {
    public boolean isThree(int n) {
        int index = n / 2;
        int number = 0;
        for (int i = 2 ;i <= index; i ++) {
            if (n % i == 0) {
                number ++;
            }
        }

        return number == 1;
    }
}
