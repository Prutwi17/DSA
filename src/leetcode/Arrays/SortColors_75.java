package leetcode.Arrays;

import java.util.Arrays;

public class SortColors_75 {
    public static void main(String[] args) {
        int [] arr = {1,0,2,1,0,2,2,1,2};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length -1;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;

                high--;
            }
        }


    }
}
