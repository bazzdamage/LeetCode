package LeetCode;

public class Prime_Number_of_Set_Bits_in_Binary_Representation_762 {
    public static void main(String[] args) {
        int left = 6;
        int right = 10;
        int res = countPrimeSetBits(left, right);
        System.out.println(res);
    }

    public static int countPrimeSetBits(int left, int right) {
        int oneCounter = 0;
        int primeCounter = 0;
        char[] curStr;
        for (int i = left; i <= right; i++) {
            curStr = Int2BinString(i).toCharArray();
            for (char c : curStr) {
                if (c == '1') {
                    oneCounter++;
                }
            }
            if (isPrime(oneCounter)) primeCounter++;
            oneCounter = 0;
        }
        return primeCounter;
    }

    private static String Int2BinString(int num) {
        if (num == 0) {
            return "";
        }
        return Int2BinString(num / 2) + (num % 2);
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        double sq = Math.sqrt(num);
        for (int i = 2; i <= sq; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
