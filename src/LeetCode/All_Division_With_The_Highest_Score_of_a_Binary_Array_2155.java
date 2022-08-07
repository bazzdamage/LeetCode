package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class All_Division_With_The_Highest_Score_of_a_Binary_Array_2155 {



    public static void main(String[] args) {
        System.out.println(maxScoreIndices(new int[] {0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0}));
    }

    public static List<Integer> maxScoreIndices(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int counter_0 = 0;
        int counter_1 = 0;
        int current_max = 0;

        for (int i = 0; i < nums.length; i ++) if (nums[i] == 1) counter_1++; // overalls 1s

        int[][] prefix_array = new int[2][nums.length + 1];

        for (int i = 0; i <= nums.length; i ++) {

            if (i != 0 && nums[i - 1] == 0) counter_0++;
            prefix_array[0][i] = counter_0;
            prefix_array[1][i] = counter_1 - (i - prefix_array[0][i]);
            if (current_max < prefix_array[0][i] + prefix_array[1][i]) current_max = prefix_array[0][i] + prefix_array[1][i];

        }

        for (int i = 0; i <= nums.length; i ++) {

            if (current_max == prefix_array[0][i] + prefix_array[1][i]) list.add(i);

        }
        return list;
    }

}
