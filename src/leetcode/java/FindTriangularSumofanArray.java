package leetcode.java;

import java.util.*;
import java.util.stream.Collectors;

public class FindTriangularSumofanArray {
        public int triangularSum(int[] nums) {
         List<Integer> list  = Arrays.stream(nums).boxed().collect(Collectors.toList());
       return eval(list);
    }
    public int eval(List<Integer> list){
        if(list.size() == 1){
            return list.get(0) % 10;
        }
        List<Integer> inner = new ArrayList<>();

        for (int i = 0; i < list.size()-1; i++) {
            inner.add(list.get(i)%10 + list.get(i+1)%10);
        }
        return eval(inner);
    }
}
