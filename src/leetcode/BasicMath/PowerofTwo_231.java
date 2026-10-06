package leetcode.BasicMath;

public class PowerofTwo_231 {
    public static void main(String[] args) {
        int n = 16;
        System.out.println("isPowerOfTwo: "+isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n-1)) == 0;
    }
}
