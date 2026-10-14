
package leetcode.Pattern;

public class NumberInNumber {

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {

                int top = i;
                int left = j;
                int bottom = 2 * n - 2 - i;
                int right = 2 * n - 2 - j;

                int layer = Math.min(
                        Math.min(top, bottom),
                        Math.min(left, right)
                );

                System.out.print(layer+1);
            }
            System.out.println();
        }
    }
}
