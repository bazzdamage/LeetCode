package LeetCode;

public class Search_Insert_Position_35 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        int target = 4;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) return nums.length;
        if (target < nums[0]) return 0;
        return recSearch(nums, target, 0, nums.length);
    }
    private static int recSearch(int[] nums, int target, int left, int right) {
        int mid = left + (right - left) / 2;

        if (left >= right) return left;

        if (nums[mid] == target) return mid;

        else if (nums[mid] > target) return recSearch(nums, target, left, mid);
        else return recSearch(nums, target,mid + 1, right);
    }
}
