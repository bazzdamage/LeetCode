package LeetCode;

import java.util.HashMap;
import java.util.Stack;

public class Valid_Parenthesis_20 {
    public static void main(String[] args) {
        String s = "()[]]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> parenthesis = new HashMap<>();
        parenthesis.put('(', ')');
        parenthesis.put('[', ']');
        parenthesis.put('{', '}');

        var stack = new Stack<Character>();
        var chars = s.toCharArray();

        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.empty()) return false;
                if (parenthesis.get(stack.pop()) != c) return false;
            }
        }

        return stack.empty();

    }
}

