package LeetCode;

import java.util.HashMap;

public class Permutation_In_String_567 {
    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> s1map = new HashMap<>();
        HashMap<Character, Integer> temp = new HashMap<>();
        char[] s1chars = s1.toCharArray();
        char[] s2chars = s2.toCharArray();
        int start = 0;
        int end = s1chars.length;

        for (Character c : s1chars) {
            if (s1map.containsKey(c)) {
                s1map.put(c, s1map.get(c) + 1);
            } else {
                s1map.put(c, 1);
            }
        }
        while (end <= s2chars.length) {
            for (int i = start; i < end; i++) {
                if (temp.containsKey(s2chars[i])) {
                    temp.put(s2chars[i], temp.get(s2chars[i]) + 1);
                } else {
                    temp.put(s2chars[i], 1);
                }
            }
            if (s1map.equals(temp)) return true;
            temp.clear();
            start++;
            end++;
        }

        return false;

    }
}
