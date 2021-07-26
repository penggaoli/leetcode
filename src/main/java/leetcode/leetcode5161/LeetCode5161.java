package leetcode.leetcode5161;

public class LeetCode5161 {
    public int canBeTypedWords(String text, String brokenLetters) {

        String[] strings = text.split(" ");
        int length = strings.length;
        int brokenLen = brokenLetters.length();
        if (length == 0){
            return length;
        }
        for (String string : strings) {
            for (int i = 0; i < brokenLen; i++) {
                if (string.contains(String.valueOf(brokenLetters.charAt(i)))) {
                    length --;
                    break;
                }
            }
        }
        return length;
    }
}
