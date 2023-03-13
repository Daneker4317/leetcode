package leetcode.java;

import java.util.Arrays;

public class FindFirstPalindromicStringintheArray {
    public String firstPalindrome(String[] words) {
        return Arrays.stream(words).filter(this::isPalindrome).toList().stream().findFirst().orElse("");}
    public boolean isPalindrome(String str){
      return str.equals(new StringBuilder(str).reverse().toString());
    }
}
