package leetcode.java;

import java.util.*;

public class FindAllDuplicatesinanArray {
        public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length-1;i++){
          if(nums[i] == nums[i+1]){
            set.add(nums[i]);
          }
        }
            return new ArrayList<>(set);
    }
}
