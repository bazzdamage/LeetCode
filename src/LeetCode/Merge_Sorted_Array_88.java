package LeetCode;

public class Merge_Sorted_Array_88 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int m = 3;
        int[] arr2 = {2,5,6};
        int n = 3;
        merge(arr1, m, arr2, n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0){return;}

        int last = n + m - 1;
        m = m - 1;
        n = n - 1;

        while ( n >= 0 ){
            if (m >= 0 && nums1[m] > nums2[n]){
                nums1[last--] = nums1[m--];
            }
            else {nums1[last--] = nums2[n--];}
        }
        for (var el: nums1
             ) {
            System.out.print(el + " ");
        }
    }
}
