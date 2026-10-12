package leetcode.BinarySearch;

public class SqrtOfNumber_69 {
    public static void main(String[] args) {
        int num  = 25;
        System.out.println(mySqrt(num));

    }
    public static int mySqrt(int x) {
        int left = 1;
        int right = x;
        int ans = 0;

        while(left <= right){
            int mid = left + (right - left) /2;

            if(mid <= x/mid){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
}
