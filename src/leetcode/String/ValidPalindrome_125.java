package leetcode.String;

public class ValidPalindrome_125 {
    public static void main(String[] args) {
        String s = " mAmam amam";
        System.out.println("isPalindrome: "+isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
