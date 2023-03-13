package leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class IntersectionofTwoArrays {
     public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
          for(int j=0;j<nums2.length;j++){
            if(nums1[i] == nums2[j] && !list.contains(nums1[i])){
              list.add(nums1[i]);
            }
          }
        }
        int [] res = new int[list.size()];
        for(int i=0;i<res.length;i++){
          res[i] = list.get(i);
        }
        return res;
    }
}
