package leetcode.java;

import java.util.*;

public class EvaluateReversePolishNotation {
      public int evalRPN(String[] tokens) {
       Stack<String> stack = new Stack<>();
       List<String> operations = List.of("+" , "-" , "*" , "/");
       for(String str : tokens){
           if (!operations.contains(str)){
               stack.push(str);
           }else stack.push(String.valueOf(calculate(stack.pop() , stack.pop() , str)));
       }

       return Integer.parseInt(stack.pop());
    }
    public int calculate(String a , String b , String operation){
       int x = Integer.parseInt(a);
       int y = Integer.parseInt(b);

       switch (operation){
           case "+" -> {return x+y;}
           case "-" -> {return y-x;}
           case "*" -> {return x*y;}
           default -> {return y / x;}
       }
    }
}
