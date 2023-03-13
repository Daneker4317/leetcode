package leetcode.java;

import java.util.*;

public class KeyboardRow {
        public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for(String str : words){
          if(check(str.toLowerCase())){
            list.add(str);
          }
        }
        String [] arr = new String[list.size()];
        for(int i=0;i<arr.length;i++){
          arr[i] = list.get(i);
        }
        return arr;
    }
    public boolean first(String str){
      final String s = "qwertyuiop";
      for(char ch : str.toCharArray()){
        if(s.indexOf(ch)<0){
          return false;
        }
      }
      return true;
    }
     public boolean second(String str){
      final String s = "asdfghjkl";
      for(char ch : str.toCharArray()){
        if(s.indexOf(ch)<0){
          return false;
        }
      }
      return true;
    }
    public boolean third(String str){
     final String s = "zxcvbnm";
      for(char ch : str.toCharArray()){
        if(s.indexOf(ch)<0){
          return false;
        }
      }
      return true;
    }
    public boolean check(String res){
      if(first(res))return true;
      if(second(res))return true;
      if(third(res))return true;
      return false;
    }
}
