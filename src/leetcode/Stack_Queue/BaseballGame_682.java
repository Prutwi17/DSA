package leetcode.Stack_Queue;

import java.util.Stack;

public class BaseballGame_682 {
    public static void main(String[] args) {
        String [] str = {"5","-2","4","C","D","9","+","+"};
        System.out.println("Score: "+calPoints(str));
    }
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String str : operations){
            if(str.equals("C")){
                stack.pop();
            }else if(str.equals("D")){
                stack.push(2*stack.peek());
            }else if(str.equals("+")){
                int last = stack.pop();
                int slast = stack.peek();
                int sum = last + slast;
                stack.push(last);
                stack.push(sum);
            }else{
                stack.push(Integer.parseInt(str));
            }

        }
        int score = 0;
        for(int i:stack){
            score += i;
        }
        return score;

    }
}
