package LeetCode;

public class Add_Digits_258 {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }

    static public int addDigits(int num) {
        if (num == 0) return 0;
        int dR = num % 9; // digital root of num = remainder from divide num to base - 1
        if (dR == 0) return 9;
        return dR;
    }
}
