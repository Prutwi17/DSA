package leetcode.BasicMath;

public class ReverseInteger_7 {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(reverse(num));
    }
    public static int reverse(int x) {
        int rev = 0;
        while(x != 0){

            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            rev = rev*10 + digit;
            x /= 10;
        }

        return rev;

    }
}
