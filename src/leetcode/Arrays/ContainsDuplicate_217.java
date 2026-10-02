package leetcode.Arrays;

import java.util.HashSet;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,5,6};
        if(containsDuplicate(arr)){
            System.out.println("Duplicate Exists");
        }else{
            System.out.println("Duplicate does not Exist");
        }

    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;

    }

}
