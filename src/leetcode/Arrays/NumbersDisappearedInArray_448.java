package leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersDisappearedInArray_448 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,1,2};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] > 0){
                nums[index] = - nums[index];
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;
    }

}
