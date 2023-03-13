package leetcode.java;

import java.util.*;

public class ShortestDistancetoaCharacter {
        public int[] shortestToChar(String s, char c) {
    List<Integer> indexs = new ArrayList<>();
    for(int i=0;i<s.length();i++){
      if(s.charAt(i) == c){
        indexs.add(i);
      }
    }
    int [] res = new int [s.length()];
    for(int i=0;i<res.length;i++){
      res[i] = check(indexs,i);
    }
    return res;
    }
    public int check(List<Integer> list,int index){
      int k =Integer.MAX_VALUE;
      for(int value : list){
        if(Math.abs(value-index)<k){
          k = Math.abs(value-index);
        }
      }
      return k;
    }
}
