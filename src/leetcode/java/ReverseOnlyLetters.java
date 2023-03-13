package leetcode.java;

import java.util.*;

public class ReverseOnlyLetters {
        public String reverseOnlyLetters(String s) {
        char [] arr = s.toCharArray();
        Stack<Character> stack  = new Stack<>();
        for(char c : s.toCharArray()){
          if(Character.isLetter(c)){
            stack.push(c);
          }
        }
         System.out.print(stack);
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
          if(Character.isLetter(ch)){
            sb.append(stack.pop());
          }else sb.append(ch);
        }
        return sb.toString();

    }
}
