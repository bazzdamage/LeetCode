package LeetCode;

import java.util.Arrays;

public class Two_Sum_II_Input_Array_Is_Sorted_167 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int calcRem = target - numbers[i];
            int temp = binarySearch(numbers, calcRem, i + 1, numbers.length);
            if (temp != -1) {
                res[0] = i + 1;
                res[1] = temp + 1;
                break;
            }
        }
        return res;
    }

    static int binarySearch(int[] nums, int target, int left, int right) {
        int mid = left + (right - left) / 2;

        if (left >= right) return -1;

        if (nums[mid] == target) return mid;

        else if (nums[mid] > target) {
            return binarySearch(nums, target, left, mid);
        } else return binarySearch(nums, target, mid + 1, right);
    }
}
