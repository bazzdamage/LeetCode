package LeetCode;

public class Guess_Number_Higher_or_Lower_374 {
    static int n = 2126753390;
    static int pick = 1702766719;
    public static void main(String[] args) {
        System.out.println(guessNumber(n));
    }
    public static int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(guess(mid) == 0) {
                left = mid;
                break;
            }
            else if (guess(mid) == -1){
                right = mid;
            } else if(guess(mid) == 1){
                left = mid + 1;
            }
        }
        return left;
    }
    private static int guess(int num) {
        if (num > pick) {
            System.out.println(num + " is higher");
            return -1;
        }
        else if (num < pick){
            System.out.println(num + " is lower");
            return 1;
        }
        else {
            System.out.println(num + " is equal");
            return 0;
        }
    }
}
