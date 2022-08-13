package LeetCode;

public class First_Bad_Version_278 {
    static int bad = 40;
    public static void main(String[] args) {
        int n = 555;
        System.out.println("bad ver = " + firstBadVersion(n));
    }
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private static boolean isBadVersion(int n) {
        if (n >= bad) {
            System.out.println(n + " is bad");
            return true;
        }
        else {
            System.out.println(n + " is not bad");
            return false;
        }
    }
}
