package leetcode.leetcode20;

import java.util.ArrayList;
import java.util.List;

public class LeetCode20 {
    public List<String> generateParenthesis(int n) {
        List<String>[] results = new List[n+1];
        List<String> number0 = new ArrayList<String>();
        number0.add("");
        results[0] = number0;
        List<String> number1 = new ArrayList<String>();
        number1.add("()");
        results[1] = number1;

        for (int i = 2; i <= n; i++) {
            List<String> number = new ArrayList<String>();
            for (int j = 0; j < i; j++) {
                List<String> per = results[j];
                List<String> last = results[i-j-1];
                for (String s1 : per) {
                    for (String s2 : last) {
                        number.add("("+s1+")"+s2);
                    }
                }
            }
            results[i] = number;
        }

        return results[n];
    }
}
