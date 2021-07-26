package leetcode.leetcode1137;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1137 {
    public int tribonacci(int n) {
        List<Integer> result = new ArrayList<Integer>();

        result.add(1);
        result.add(1);
        result.add(0);

        if (n < 3) {
            return result.get(2 - n);
        }

        for (int i = 3; i <= n; i++) {
            result.add(0, result.get(0)+ result.get(1)+result.get(2));
            result.remove(3);
        }

        return result.get(0);
    }
}
