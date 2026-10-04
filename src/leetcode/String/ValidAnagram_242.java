package leetcode.String;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println("isAnagram: "+isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int [] count = new int[26];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int num:count){
            if(num != 0){
                return false;
            }
        }

        return true;

    }
}
