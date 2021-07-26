package leetcode.leetcode5824;

import javax.security.auth.Subject;

public class LeetCode5824 {
    public String maximumNumber(String num, int[] change) {
        int length = num.length();

        for (int i = 0; i < length; i++) {
            int valuei = num.charAt(i) - '0';
            if (valuei < change[valuei]) {
                String per = num.substring(0, i);
                for (int j = i; j < length; j++) {
                    int valuej = num.charAt(j) - '0';
                    if (valuej <= change[valuej]) {
                        per += change[valuej];
                    } else {
                        per += num.substring(j);

                        return per;
                    }
                }
                return per;
            }
        }
        return num;
    }
}
