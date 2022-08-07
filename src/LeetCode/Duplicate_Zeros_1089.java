package LeetCode;

public class Duplicate_Zeros_1089 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }
    public static void duplicateZeros(int[] arr) {
        int[] temp = arr.clone();
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = temp[j];
            if (temp[j] == 0 & i != arr.length - 1) {
                arr[i + 1] = 0;
                i++;
            }
            j++;
        }
    }
}
