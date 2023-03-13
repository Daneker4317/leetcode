package leetcode.java;

public class ReplaceAllDigitswithCharacters {
        public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
          if(Character.isLetter(s.charAt(i))){
            sb.append(s.charAt(i));
          }else{
            sb.append((char)(s.charAt(i-1)+Character.getNumericValue(s.charAt(i))));
          }
        }
    return sb.toString();
    }
}
