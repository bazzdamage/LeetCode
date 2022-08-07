package LeetCode;

import java.util.ArrayList;
import java.util.List;


public class Find_combinations {
    public static void main(String[]args){
        Integer[] s = {1, 2, 3};
        recursionCombination("", 0, s, new ArrayList<>());
    }
    public static void recursionCombination(String str, int count, Integer[] array, List<Integer> list) {
        for (Integer integer : array) {
            if (list.contains(integer)) break;
            System.out.println(new StringBuilder(str + integer).reverse());
            if (count < array.length - 1) {
                List<Integer> list1 = new ArrayList<>(list);
                list1.add(integer);
                recursionCombination(str + integer, count + 1, array, list1);
            }
        }
    }
}
