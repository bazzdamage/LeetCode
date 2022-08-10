package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Combinations_77 {
    public static void main(String[] args) {
        var res = combine(4, 2);
        for (var el :
                res) {
            System.out.print(el + " ");
        }
    }
    static public List<List<Integer>> combine(int n, int k) {
        var result = new ArrayList<List<Integer>>();
        if (n <= 0 || n < k) return result;
        recursiveComb(n, k, 1, new ArrayList<>(), result);
        return result;
    }

    private static void recursiveComb(int n, int k, int start, ArrayList<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == k) { res.add(new ArrayList<>(temp)); return; }
        for (int i = start; i <= n; i++) {
            temp.add(i);
            recursiveComb(n, k, i + 1, temp, res);
            temp.remove(temp.size() - 1);
        }
    }
}