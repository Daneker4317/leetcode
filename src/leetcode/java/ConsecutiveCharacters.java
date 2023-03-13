package leetcode.java;

public class ConsecutiveCharacters {
        public int maxPower(String s) {
        int counter = 1;
        int res = 1;
        for(int i=0;i<s.length()-1;i++){
          if(s.charAt(i) == s.charAt(i+1)){
            counter ++;
            res = Math.max(res, counter);
          }else counter = 1;
        }
        return res;
    }
}
