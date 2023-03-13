package leetcode.java;

import java.util.*;

public class MajorityElement {
        public int majorityElement(int[] nums) {
          Map<Integer , Integer> map = new HashMap<>();
        for(int i : nums){
            map.compute(i , (k,v) -> (v==null) ? 1 : ++v);
        }
        return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).toList().get(0).getKey();
    }
}
