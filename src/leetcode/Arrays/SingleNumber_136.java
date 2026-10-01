package leetcode.Arrays;

public class SingleNumber_136 {
    public static void main(String[] args) {

    }
    public static int singleNumber(int[] nums) {

        int result = 0;

        for(int num:nums){
            result ^= num;
        }

        return result;
    }

}
