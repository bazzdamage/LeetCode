package LeetCode;

public class Duplicate_Zeros_1089 {
    public static void main(String[] args) {
        //int[] arr = {1,0,2,3,0,4,5,0};
        //int[] arr = {0,0,0,0,0,0,0};
        //int[] arr = {0,1,7,6,0,2,0,7}; //[0,0,1,7,6,0,0,2]
        int[] arr = {8, 4, 5, 0, 0, 0, 0, 7}; //[8,4,5,0,0,0,0,0] 8 4 5 0 0 0 0 0 0 0 0 7
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        int duplicates = 0;
        int length = arr.length - 1;
        for (int i = 0; i <= length - duplicates; i++) {
            if (arr[i] == 0) {
                if (i == length - duplicates) {
                    arr[length] = 0;
                    length--;
                    break;
                }
                duplicates++;
            }
        }
        int last = length - duplicates;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + duplicates] = 0;
                duplicates--;
                arr[i + duplicates] = 0;
            } else arr[i + duplicates] = arr[i];
        }
        for (var el :
                arr) {
            System.out.println(el);
        }
    }
    /*public static void duplicateZeros(int[] arr) {
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
    }*/
}
