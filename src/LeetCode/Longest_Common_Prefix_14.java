package LeetCode;

public class Longest_Common_Prefix_14 {
    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"ab", "a"};

        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));

    }

    public static String longestCommonPrefix(String[] strs) {
        String lcp = ""; //Longest Common Prefix

        if (strs.length == 0) return lcp;
        lcp = strs[0];

        for (int i = 1; i < strs.length; i++) {
            if (lcp.length() > strs[i].length()) {
                lcp = lcp.substring(0, strs[i].length());
            }
            for (int j = 0; j < lcp.length(); j++) {
                if (lcp.charAt(j) != strs[i].charAt(j)) {
                    lcp = lcp.substring(0, j);
                }
            }
        }

        return lcp;
    }

}
