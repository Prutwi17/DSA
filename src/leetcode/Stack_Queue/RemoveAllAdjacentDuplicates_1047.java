package leetcode.Stack_Queue;

public class RemoveAllAdjacentDuplicates_1047 {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));

    }
    public static String removeDuplicates(String s) {

        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (stack.length() > 0 && stack.charAt(stack.length() - 1) == ch) {
                stack.deleteCharAt(stack.length() - 1);
            } else {
                stack.append(ch);
            }
        }

        return stack.toString();
    }

}
