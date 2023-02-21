package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum_1 {
    public static void main(String[] args) {

        int[] nums1 = {2, 7, 11, 15};
        int nums1target = 9;
        int[] nums2 = {3, 2, 4};
        int nums2target = 6;
        int[] nums3 = {3, 3};
        int nums3target = 6;

        System.out.println(Arrays.toString(twoSum(nums1, nums1target)));
        System.out.println(Arrays.toString(twoSum(nums2, nums2target)));
        System.out.println(Arrays.toString(twoSum(nums3, nums3target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        map.put(target - nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[1] = i;
                result[0] = map.get(nums[i]);
            }
            map.put(target - nums[i], i);
        }

        return result;
    }

}
