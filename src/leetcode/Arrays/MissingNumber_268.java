package leetcode.Arrays;

public class MissingNumber_268 {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,6};
        System.out.println(missingNumber(arr));

    }
    public static int missingNumber(int[] nums) {

        int n = nums.length;

        int sum = (n*(n+1)) / 2;
        for(int i=0;i<nums.length;i++){
            sum -= nums[i];
        }

        return sum;

    }
}
