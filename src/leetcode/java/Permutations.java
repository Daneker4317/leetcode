package leetcode.java;

import java.util.*;

public class Permutations {
     public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();

    boolean [] isVisited = new boolean[nums.length];
    List<Integer> inner = new ArrayList<>();
    solution(nums , inner , list , isVisited);

    return list;
    }

    public void solution(int [] arr , List<Integer> inner , List<List<Integer>> list , boolean [] isVisited){
      if(inner.size() == arr.length){
        list.add(inner);
        return;
      }
      for(int i=0;i < arr.length; i++){
        if(!isVisited[i]){
          isVisited[i] = true;
          inner.add(arr[i]);
          solution(arr , inner , list , isVisited);
          inner.remove(inner.size()-1);
          isVisited[i] = false;
        }
      }
    }
}
