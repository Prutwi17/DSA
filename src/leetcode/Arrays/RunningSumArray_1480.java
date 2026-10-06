package leetcode.Arrays;

import java.util.Arrays;

public class RunningSumArray_1480 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));

    }
        public static int[] runningSum(int[] nums) {
            int sum = 0;
            int index = 0;
            while (index < nums.length) {
                sum += nums[index];
                nums[index] = sum;
                index++;
            }
            return nums;
        }
}
