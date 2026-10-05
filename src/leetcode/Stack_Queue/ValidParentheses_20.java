package leetcode.Stack_Queue;

import java.util.Stack;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        String s = "{([])}";
        System.out.println("isValid: "+isValid(s));
    }
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch:s.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                if(
                        (ch == ')' && top != '(') ||
                                (ch == '}' && top != '{') ||
                                (ch == ']' && top != '[')
                ){
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
