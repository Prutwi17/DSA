package leetcode.BinarySearch;

public class ValidPerfectSquare_367 {
    public static void main(String[] args) {
        int num = 25;
        System.out.println("Number is Perfect Square: "+isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {

        int left = 1;
        int right = num;
        boolean isPerfect = false;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(mid == num/mid && num % mid == 0){
                isPerfect = true;
                return isPerfect;
            }else if(mid < num/mid){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return isPerfect;
    }
}
