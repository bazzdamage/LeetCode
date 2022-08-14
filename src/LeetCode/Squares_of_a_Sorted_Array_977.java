package LeetCode;

public class Squares_of_a_Sorted_Array_977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        var temp = sortedSquares(nums);
        for (var el :
                temp) {
            System.out.println(el);
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int leftp = 0;
        int rightp = nums.length - 1;
        int[] res = new int[nums.length];
        int counter = 0;
        while (counter < nums.length) {
            int leftpow = nums[leftp] * nums[leftp];
            int rightpow = nums[rightp] * nums[rightp];
            if ((leftpow) > (rightpow)) {
                res[nums.length - counter - 1] = leftpow;
                leftp++;
                counter++;
            }
            else {
                res[nums.length - counter - 1] = rightpow;
                rightp--;
                counter++;
            }
        }
        return res;
    }
}
