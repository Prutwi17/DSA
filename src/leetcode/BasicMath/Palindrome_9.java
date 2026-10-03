package leetcode.BasicMath;

public class Palindrome_9 {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }
    public static boolean isPalindrome(int x) {
        int org = x;
        int temp = 0;

        while(x > 0){

            int digit = x % 10;
            temp = temp * 10 + digit;

            x /= 10;

        }

        return org == temp;
    }
}
