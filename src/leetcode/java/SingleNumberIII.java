package leetcode.java;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SingleNumberIII {
        public int[] singleNumber(int[] nums) {
          Map<Integer,Integer> map = new TreeMap<>();
        for(int value : nums){
            map.compute(value , (k,v) -> (v==null) ? 1 : ++v);
        }

        List<Integer> list = map.entrySet().stream().filter(i -> i.getValue() == 1).map(Map.Entry::getKey).toList();
        System.out.print(map);
        return new int[]{list.get(0) , list.get(1) };
    }
}
