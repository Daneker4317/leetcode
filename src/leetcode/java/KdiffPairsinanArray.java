package leetcode.java;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class KdiffPairsinanArray {
        public int findPairs(int[] arr, int k) {
      Set<TreeSet<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if((int)Math.abs(arr[i] - arr[j]) == k){
                    set.add(new TreeSet<>(List.of(arr[i] , arr[j])));
                }
            }
        }
        return set.size();
    }
}
