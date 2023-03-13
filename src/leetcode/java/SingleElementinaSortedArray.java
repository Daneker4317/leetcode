package leetcode.java;
import java.util.*;
public class SingleElementinaSortedArray {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer , Integer> map = new TreeMap<>();
        for(int value : nums){
          map.compute(value , (k,v) -> (v==null)?1:++v);
        }
        System.out.print(map);
        return getKey(map , 1);
    }
    public static <K, V> K getKey(Map<K, V> map, V value) {
    return map.keySet()
                .stream()
                .filter(key -> value.equals(map.get(key)))
                .findFirst().get();
    }
}
