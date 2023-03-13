package leetcode.java;

import java.util.Stack;

public class ValidParentheses {
        public boolean isValid(String str){
        if(str.length()%2!=0)return false;
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '[' || ch == '(' || ch == '{'){
               stack.push(ch);
            }else if(ch == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else if(ch == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
