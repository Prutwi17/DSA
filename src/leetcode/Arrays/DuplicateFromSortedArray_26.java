package leetcode.Arrays;
// Two Pointer Approach
public class DuplicateFromSortedArray_26 {
    public static void main(String[] args) {
    int [] arr = {1,1,2,2,3,4,5};
    System.out.println(removeDuplicates(arr));

    }

    public static int removeDuplicates(int[] nums) {
        int slow = 0;

        for(int fast = 1;fast<nums.length;fast++){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }
}
