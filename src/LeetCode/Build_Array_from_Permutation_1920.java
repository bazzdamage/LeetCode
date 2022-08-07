package LeetCode;

public class Build_Array_from_Permutation_1920 {
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
        for (var elem: buildArray(arr)
             ) {
            System.out.print(elem + " ");
        }
    }
    public static int[] buildArray(int[] nums) {
        var res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {res[i] = nums[nums[i]];}
        return res;
    }
}
