package leetcode.java;

import java.util.Arrays;

public class MergeSortedArray {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
       int c = 0;
       for(int i=m;i<m+n;i++){
           nums1[i]=nums2[c];
           c++;
       }
       Arrays.sort(nums1);
       for(int i=0;i<m+n;i++){
           System.out.print(nums1[i] + ",");
       }
    }
}
