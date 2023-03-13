package leetcode.java;

import java.util.*;
import java.util.stream.IntStream;

public class FindAllNumbersDisappearedinanArray {
     public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
          set.add(i);
        }

        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
          if(!set.contains(i)){
            list.add(i);
          }
        }

        return list;
    }
}
