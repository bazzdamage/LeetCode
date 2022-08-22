package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersection_of_Two_Arrays_II_350 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length < nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        HashMap<Integer, Integer> largeArr = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>(nums2.length);

        for (int i : nums1) {
            if (largeArr.containsKey(i)) {
                largeArr.put(i, largeArr.get(i) + 1);
            } else {
                largeArr.put(i, 1);
            }
        }

        for (int i : nums2) {
            if (largeArr.containsKey(i)) {
                result.add(i);
                if (largeArr.get(i) > 1) {
                    largeArr.put(i, largeArr.get(i) - 1);
                } else largeArr.remove(i);
            }
        }

        int[] out = new int[result.size()];
        int i = 0;

        for (Integer item : result) {
            out[i] = item;
            i++;
        }

        return out;

    }
}
