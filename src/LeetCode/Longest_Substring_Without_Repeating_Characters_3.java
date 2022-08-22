package LeetCode;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters_3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        int subStrCount;
        int subStrMax = 0;
        char[] temp = s.toCharArray();
        HashSet<Character> subStr = new HashSet<>();

        for (int i = 0; i < temp.length; i++) {
            subStrCount = 0;
            for (int j = i; j < temp.length; j++) {
                if (!subStr.contains(temp[j])) {
                    subStr.add(temp[j]);
                    subStrCount++;
                    if (subStrCount > subStrMax) {
                        subStrMax = subStrCount;
                    }
                } else {
                    subStr.clear();
                    break;
                }
            }
        }

        return subStrMax;

    }
}
