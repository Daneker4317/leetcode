package leetcode.java;

import java.util.*;

public class DistributeCandies {
        public int distributeCandies(int[] candyType) {
        if(types(candyType)==1)return 1;
        return Math.min(candyType.length / 2, types(candyType));
    }
    public int types(int [] a){
        Set<Integer> list = new HashSet<>();
        for(int key : a){
          list.add(key);
        }
        return list.size();
    }
}
