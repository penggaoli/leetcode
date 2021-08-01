package interview.interview_05_03;

import java.awt.*;

public class InterView_05_03 {
    public int reverseBits(int num) {
        String valStr = Integer.toBinaryString(num);
        valStr = num > 0 && valStr.charAt(0) == '1' ? 0 + valStr : valStr;
        int len = valStr.length();

        int first = 0;
        int second = 0;
        int max = 0;
        for (int i = 0; i < len; i++) {
            if (valStr.charAt(i) == '1') {
                first ++;
            } else{
                second = first + 1;
                first = 0;
            }

            max = max > second + first ? max : first + second;
        }

        return max;
    }
}
