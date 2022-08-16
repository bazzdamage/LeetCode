package LeetCode;

import java.util.Arrays;

public class Reverse_String_344 {
    public static void main(String[] args) {
        char[] s = {'1', '2', '3', '4', '5', '6'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        char temp;
        int l = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[l - i];
            s[l - i] = temp;
        }
        System.out.println(Arrays.toString(s));
    }
}