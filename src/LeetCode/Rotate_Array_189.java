package LeetCode;

import java.util.Arrays;

public class Rotate_Array_189 {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        int k = 3;
        rotate(nums, k);
    }
    public static void rotate(int[] nums, int k) {
        int[] res = Arrays.copyOf(nums, nums.length);
        int pointer = k;
        if (k > nums.length) {
            pointer = k % nums.length;
        }
        for (int re : res) {
            if (pointer > res.length - 1) {
                pointer = 0;
            }
            nums[pointer] = re;
            pointer++;
        }
        for (var el :
                nums) {
            System.out.println(el);
        }
    }
}
