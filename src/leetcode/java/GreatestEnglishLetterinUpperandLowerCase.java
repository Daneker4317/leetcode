package leetcode.java;

public class GreatestEnglishLetterinUpperandLowerCase {
    public String greatestLetter(String s) {
      char r = 'A';
        for(char ch : s.toCharArray()){
          if(s.contains(String.valueOf(ch).toUpperCase()) && s.contains(String.valueOf(ch).toLowerCase()) && ch > r){
            r = ch;
          }
        }
        return r=='A'?"":String.valueOf(r).toUpperCase();
    }
}
