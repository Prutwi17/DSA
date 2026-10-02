package leetcode.Arrays;

import java.util.Arrays;

public class MoveZeroes_283 {
    public static void main(String[] args) {
        int [] arr = {0,0,0,1,2,3,4};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void moveZeroes(int[] nums) {

        int i = 0;

        for(int j=0;j<nums.length;j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;

            }
        }

    }
}
