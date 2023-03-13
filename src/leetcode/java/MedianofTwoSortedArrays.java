package leetcode.java;

import java.util.*;

public class MedianofTwoSortedArrays {
   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums1){
          list.add(i);
        }
        for(int i : nums2){
          list.add(i);
        }
        Collections.sort(list);
        int n = list.size();
        if(n%2==1){
          return (double) list.get((n-1) / 2 );
        }
        return (double)(list.get(n/2) + list.get(n/2-1)) / 2;
    }
}
