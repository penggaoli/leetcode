package leetcode.leetcode392;

public class LeetCode392 {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        int i = 0;
        int j = 0;

        while (j < tLen && i <sLen) {
            if (s.charAt(i) == t.charAt(j)) {
                i ++;
                j ++;
            } else {
                j ++;
            }
        }
        return i == sLen;
    }
}
