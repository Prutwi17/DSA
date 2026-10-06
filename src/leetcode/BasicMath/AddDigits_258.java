package leetcode.BasicMath;

public class AddDigits_258 {
    public static void main(String[] args) {
        int num = 27;
        System.out.println(addDigits(num));
    }
    public static int addDigits(int num) {
        if(num == 0){
            return 0;
        }
        return 1+(num-1) % 9;
    }
}
