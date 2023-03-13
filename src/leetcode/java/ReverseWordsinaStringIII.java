package leetcode.java;

import java.util.Arrays;

public class ReverseWordsinaStringIII {
        public String reverseWords(String s) {
        String [] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
            Arrays.stream(str).forEach(t -> sb.append(t).append(" "));
        return sb.toString().trim();
    }
    public String reverse(String s){
      StringBuilder sb = new StringBuilder();
      sb.append(s);
      sb.reverse();
      return sb.toString();
    }
}
