package leetcode.Arrays;

public class SingleNumber_136 {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,2,4,4};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {

        int result = 0;

        for(int num:nums){
            result ^= num;
        }

        return result;
    }

}
