package leetcode.String;

public class ReverseWordsString_151 {
    public static void main(String[] args) {
        String s = "I am an Engineer";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {

        String [] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            if(i !=0){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
