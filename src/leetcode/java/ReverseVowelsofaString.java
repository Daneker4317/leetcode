package leetcode.java;

import java.util.Stack;

public class ReverseVowelsofaString {
        public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        char [] array = s.toCharArray();
        for(char ch : array){
          if(check(ch)){
            stack.push(ch);
          }
        }
        for(int i=0;i<array.length;i++){
          if(check(array[i])){
            array[i] = stack.pop();
          }
        }
        return String.valueOf(array);
    }
     public boolean check(char ch){
      final String str = "aeiouAEIOU";
      return str.indexOf(ch)>-1;
    }
}
