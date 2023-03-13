package leetcode.java;

public class Maximum69Number {
          public int maximum69Number (int num) {
        int c =0 ;
       String str = Integer.toString(num);
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='6' && c==0){
               c++;
               sb.append('9');
           }else   sb.append(str.charAt(i));
       }
       return Integer.parseInt(sb.toString());
    }
}
