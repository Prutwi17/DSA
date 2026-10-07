package leetcode.String;

import java.util.HashSet;

public class LongestSubstring_3 {
    public static void main(String[] args) {
        String s = "abcdabc";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxSum = 0;
        HashSet<Character> set = new HashSet<>();

        for(int right=0;right<s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            maxSum = Math.max(maxSum, right - left + 1);
        }
        return maxSum;
    }
}
