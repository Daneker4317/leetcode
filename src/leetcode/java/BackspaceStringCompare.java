package leetcode.java;

public class BackspaceStringCompare {
        public boolean backspaceCompare(String s, String t) {

      System.out.print(convert(s) + " " + convert(t));
        return filter(convert(s)).equals(filter(convert(t)));
    }
    public String convert(String str){
      StringBuilder sb = new StringBuilder();
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='#'  && sb.length()>0){
          sb.deleteCharAt(sb.length()-1);
        }else{
          sb.append(str.charAt(i));
        }
      }
      return sb.toString();
    }
    public String filter(String str){
      StringBuilder sb = new StringBuilder();
      for(char ch : str.toCharArray()){
        if(ch!='#'){
          sb.append(ch);
        }
      }
      return sb.toString();
    }
}
