package LeetCode;

import java.util.ArrayList;

public class Reverse_Words_in_a_String_151 {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        var sb = new StringBuilder();
        var res = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            }
            if (s.charAt(i) == ' ' & sb.length() > 0)  {
                res.add(sb.toString());
                sb.setLength(0);
            }
            if (i == s.length() - 1 & s.charAt(i) != ' '){
                res.add(sb.toString());
                sb.setLength(0);
            }
        }
        for (var el : res
             ) {
            sb.insert(0, el + ' ');
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
