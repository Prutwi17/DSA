package leetcode.BinarySearch;

public class GuessNumber_374 {
    public static int number = 10;
    public static void main(String[] args) {
        int num = GuessNumber_374.number;
        System.out.println("Picked number: "+guessNumber(num));
    }
    public static int guessNumber(int n) {

        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid);

            if (result == 0) {
                return mid;
            }
            else if (result > 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int guess(int mid) {
        if (mid > number) {
            return -1;
        }
        else if (mid < number) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
