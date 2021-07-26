package leetcode.leetcode275;

import java.security.KeyStore;
import java.util.logging.Logger;

public class LeetCode275 {
    private static Logger logger = Logger.getLogger("LeetCode275");
    public static void main(String[] args) {
        int[] list = {0,1,3,5,6};
        logger.info(String.valueOf(hIndex(list)));
    }

    public static int hIndex(int[] citations) {
        int n = citations.length;
        int h = 1;
        for (int i = 0; i < n; i++) {
            h = citations[i];
        }
        return h;
    }
}
