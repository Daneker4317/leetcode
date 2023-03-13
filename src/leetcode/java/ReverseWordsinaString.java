package leetcode.java;

public class ReverseWordsinaString {
        public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String [] str = s.replaceAll("[\\s]{2,}"," ").split(" ");
        for(int i = str.length - 1; i >= 0 ; i--){
          sb.append(str[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
