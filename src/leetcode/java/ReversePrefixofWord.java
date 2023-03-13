package leetcode.java;

public class ReversePrefixofWord {
       public String reversePrefix(String word, char ch) {
    int index =  word.indexOf(ch);
    if(index<0){
      return word;
    }
    StringBuilder sb = new StringBuilder();
    sb.append(word.substring(0,index+1));
    sb.reverse();
    sb.append(word.substring(index+1,word.length()));
    return sb.toString();
    }
}
