package leetcode.leetcode120;

import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class LeetCode120 {
    private static Logger logger = Logger.getLogger("LeetCode120");
    public static void main(String[] args) {

        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        lists.add(new ArrayList<Integer>(){{add(2);}});
        lists.add(new ArrayList<Integer>(){{add(3); add(4);}});
        lists.add(new ArrayList<Integer>(){{add(6); add(5);add(7);}});
        lists.add(new ArrayList<Integer>(){{add(4); add(1);add(8);add(3);}});
        int total = minimumTotal(lists);
        logger.info(String.valueOf(total));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int min = triangle.get(0).get(0);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int flag = triangle.get(i).get(j);
                if (i == 0 && j == 0) {
                } else if (j == 0) {
                    triangle.get(i).set(j, triangle.get(i-1).get(j) + flag);
                } else if (i == j) {
                    triangle.get(i).set(j, triangle.get(i-1).get(j-1) + flag);
                } else {
                    triangle.get(i).set(j, Math.min(triangle.get(i-1).get(j-1), triangle.get(i-1).get(j)) + flag);
                }
                if (i == triangle.size() -1) {
                    min = j == 0 ? triangle.get(i).get(j) : Math.min(triangle.get(i).get(j), min);
                }
            }
        }
        return min;
    }
}
