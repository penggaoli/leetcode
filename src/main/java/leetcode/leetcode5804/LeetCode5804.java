package leetcode.leetcode5804;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode5804 {
    public boolean areOccurrencesEqual(String s) {
        Map<String,Integer> num = new HashMap<String, Integer>(8);
        int len = s.length();
        for (int i = 0; i < len; i++) {
            String str = String.valueOf(s.charAt(i));
            Integer integer = num.get(str);
            if (null == integer) {
                integer = 1;
                num.put(str, integer);
            } else {
                integer ++;
                num.put(str, integer);
            }
        }
        Integer[] values = num.values().toArray(new Integer[num.values().size()]);
        for (int i = 0; i < values.length-1; i++) {
            if (!values[i].equals(values[i+1])) {
                return false;
            }
        }

        return true;
    }
}
