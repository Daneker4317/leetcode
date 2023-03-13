package leetcode.java;
import java.util.*;
public class MajorityElementII {
        public List<Integer> majorityElement(int[] nums) {
        Set<Integer> list = new TreeSet<>();
        for(int value : nums){
          if(check(nums,value)){
            list.add(value);
          }
        }
            return new ArrayList<>(list);
    }
    public boolean check(int [] arr , int value){
      int h =0;
      for(int v : arr){
        if(v==value){
          h++;
        }
      }
      return arr.length / 3 < h;
    }
}
