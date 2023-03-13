package leetcode.java;

public class StrongPasswordCheckerII {
        public boolean strongPasswordCheckerII(String str) {
        if(str.length()<8)return false;
        for(int i=0;i<str.length()-1;i++){
          if(str.charAt(i)==str.charAt(i+1)){
            return false;
          }
        }
        int  u = 0,l=0,d=0,s=0;
        for(char ch : str.toCharArray())
{
  if(Character.isDigit(ch))d++;
  if(Character.isUpperCase(ch))u++;
  if(Character.isLowerCase(ch))l++;
  if(!Character.isDigit(ch) && !Character.isAlphabetic(ch))s++;
}
if(d>0 && u>0 && l>0 && s>0 ){
  return true;
}
return false;
}
}
