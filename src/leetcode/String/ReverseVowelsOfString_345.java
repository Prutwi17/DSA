package leetcode.String;

public class ReverseVowelsOfString_345 {
    public static void main(String[] args) {
        String s = "IceCream";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            while(left < right && isVowel(arr[left])){
                left++;
            }
            while(left < right && isVowel(arr[right])){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);

    }
    public static boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch) == -1;
    }
}
