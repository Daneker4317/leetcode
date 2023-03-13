package leetcode.java;

import java.util.*;

public class MoveZeroes {
        public void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int value : nums){
          if(value!=0){
            list.add(value);
          }
        }
        int index = nums.length - list.size();
        for(int i = 0;i<list.size();i++){
          nums[i] = list.get(i);
        }
        for(int i=list.size();i<nums.length;i++){
          nums[i] = 0;
        }
    }
}
