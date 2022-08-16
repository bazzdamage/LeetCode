package LeetCode;

public class Binary_Search_704 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 13));
    }

    static public int search(int[] nums, int target) {

        return recSeeker(nums, target, 0, nums.length);

    }

    private static int recSeeker(int[] nums, int target, int left, int right) {
        int mid = left + (right - left) / 2;

        if (left >= right) return -1;

        if (nums[mid] == target) return mid;

        else if (nums[mid] > target) {
            return recSeeker(nums, target, left, mid);
        } else return recSeeker(nums, target, mid + 1, right);
    }
}
