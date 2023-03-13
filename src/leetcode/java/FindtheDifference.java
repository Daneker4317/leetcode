package leetcode.java;

public class FindtheDifference {
        public char findTheDifference(String s, String t) {
        String str1 = s.length() > t.length() ? s : t;
        String str2 = str1.equals(s)? t : s;
       return(char)(sum(str1) - sum(str2));
        }
        public int sum(String str) {
          int s = 0;
          for(char ch : str.toCharArray()){
            s+=ch;
          }
          return s;
        }
}
