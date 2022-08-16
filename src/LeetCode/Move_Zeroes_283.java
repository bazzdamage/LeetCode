package LeetCode;

public class Move_Zeroes_283 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 2, 0, 4, 0, 0, 0, 5, 12, 0};
        //int[] nums = {1};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        int lastNonZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZero++] = nums[i];
            }
        }
        for (int i = lastNonZero; i < nums.length; i++) {
            nums[i] = 0;
        }
        for (var el :
                nums) {
            System.out.print(el + " ");
        }
        System.out.println();
        // Old realization
        int zeroPoint = 0;
        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    zeroPoint = i;
                    break;
                }
            }
            for (int i = zeroPoint; i < nums.length; i++) {
                if (zeroPoint == 0 && nums[zeroPoint] != 0) break;
                if (nums[i] != 0) {
                    nums[zeroPoint] = nums[i];
                    nums[i] = 0;
                    zeroPoint++;
                }
            }
        }
        for (var el :
                nums) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
