package leetcode.leetcode118;

import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        List<Integer> first = new ArrayList<Integer>();
        first.add(1);
        result.add(first);

        for (int i = 1; i < numRows; i++) {
            List<Integer> perRow = result.get(i-1);
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for (int i1 = 1; i1 < i; i1++) {
                row.add(perRow.get(i1-1) + perRow.get(i1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
