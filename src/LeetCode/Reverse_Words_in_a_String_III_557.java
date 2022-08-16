package LeetCode;

import java.util.Stack;

public class Reverse_Words_in_a_String_III_557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        var deck = new Stack<Character>();
        var chars = s.toCharArray();
        var sb = new StringBuilder();
        for (char c : chars) {
            if (c != ' ') deck.push(c);
            else {
                while (!deck.empty()) sb.append(deck.pop());
                sb.append(' ');
            }
        }
        while (!deck.empty()) sb.append(deck.pop());
        return sb.toString();
    }
}

