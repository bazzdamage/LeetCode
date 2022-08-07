package LeetCode;

public class Add_Binary_67 {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }
    public static String addBinary(String a, String b) {
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while (lenA >= 0 || lenB >= 0){
            int firstDigit = lenA >= 0 ? a.charAt(lenA--) - '0' : 0;
            int secDigit = lenB >= 0 ? b.charAt(lenB--) - '0' : 0;
            int sum = firstDigit + secDigit + carry;
            carry = sum / 2;
            res.insert(0, sum % 2);
        }
        if (carry == 1) { res.insert(0, 1); }
        return res.toString();
    }
}

