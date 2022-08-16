package LeetCode;

import java.util.Objects;
import java.util.Stack;

public class Simplify_Path_71 {
    public static void main(String[] args) {
        String path = "/home/../foo/";
        //path = "/home/";
        //path = "/a/../../b/../c//.//";
        System.out.println(simplifyPath(path));
    }

    public static String simplifyPath(String path) {
        var stack = new Stack<String>();
        var temp = path.split("/");
        var sb = new StringBuilder();

        for (String s : temp) {
            if (Objects.equals(s, "..") && !stack.empty()) {
                stack.pop();
            }
            if (!Objects.equals(s, ".") && !Objects.equals(s, "") && !Objects.equals(s, "..")) {
                stack.push(s);
            }
        }

        if (stack.empty()) sb.append("/");

        while (!stack.empty()) {
            sb.insert(0, stack.pop());
            sb.insert(0, "/");
        }

        return sb.toString();
    }
}
