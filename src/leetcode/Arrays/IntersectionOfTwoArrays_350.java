package leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays_350 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,5};
        int [] arr2 = {5,5,2,3,6};

        System.out.println(Arrays.toString(intersect(arr1,arr2)));


    }
    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:nums2){
            if(map.getOrDefault(num,0) > 0){
                list.add(num);
                map.put(num,map.get(num) -1);
            }
        }

        int[] result = new int[list.size()];

        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }

        return result;

    }

}
