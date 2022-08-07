package LeetCode;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
    public static int subtractProductAndSum(int n) {
    int product = 1;
    int sum = 0;
    while (n > 0){
        int temp = n % 10;
        sum += temp;
        product *= temp;
        n /= 10;
    }
    return product - sum;
    }
}
