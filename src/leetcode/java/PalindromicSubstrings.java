package leetcode.java;

public class PalindromicSubstrings {
          public int countSubstrings(String s) {
           int counter = s.length();
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(isPalindrome(s,i,j)){
                    counter++;
                }
            }
        }
        return counter;
    }
    public static boolean isPalindrome(String str , int i , int j){
        while(i < j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
