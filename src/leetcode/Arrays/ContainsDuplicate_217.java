package leetcode.Arrays;

import java.util.HashSet;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {

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
