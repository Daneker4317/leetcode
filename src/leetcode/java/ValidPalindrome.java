package leetcode.java;

public class ValidPalindrome {
        public boolean isPalindrome(String s) {
        String t = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(t.charAt(i))){
                sb.append(t.charAt(i));
            }
            if( Character.isDigit(t.charAt(i))){
                sb.append(t.charAt(i));
            }
        }
        String str = sb.toString();
        int i =0;
        int j = str.length()-1;
        while(i<=j){
             if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
