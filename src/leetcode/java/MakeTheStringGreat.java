package leetcode.java;

import java.util.Stack;

public class MakeTheStringGreat {
    public String makeGood(String s) {
        if (s.length() ==1 || s.length() ==0){
            return s;
        }
        Stack<Character> stack = new Stack<>(){{add(s.charAt(0));}};
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - s.charAt(i)) == 32){
                stack.pop();
            }else stack.push(s.charAt(i));
        }
        if(stack.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        stack.forEach(sb::append);
        return sb.toString();
    }
    public boolean check(String str , int index){
        return Math.abs(str.charAt(index) - str.charAt(index-1)) == 32;
    }
}
