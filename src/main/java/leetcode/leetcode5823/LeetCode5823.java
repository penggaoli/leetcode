package leetcode.leetcode5823;

import java.math.BigInteger;

public class LeetCode5823 {

    public int getLucky(String s, int k) {
        String valueStr = "";
        int length = s.length();
        for (int i = 0; i < length; i++) {
            valueStr += s.charAt(i) - 'a' + 1;
        }

        for (int i = 0; i < k; i++) {
            int v = 0;
            int strLen = valueStr.length();
            for (int i1 = 0; i1 < strLen; i1++) {
                v += Integer.valueOf(String.valueOf(valueStr.charAt(i1)));
            }
            valueStr = String.valueOf(v);
        }
        return Integer.valueOf(valueStr);
    }
}
