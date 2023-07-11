package leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class IntersectionofTwoArraysII {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            List<Integer> f = new ArrayList<>();
            List<Integer> s = new ArrayList<>();

            List<Integer> res = new ArrayList<>();

            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j] && !f.contains(i) && !s.contains(j)) {
                        f.add(i);
                        s.add(j);
                        res.add(nums1[i]);
                    }
                }
            }
            System.out.print(res);

            int[] arr = new int[res.size()];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = res.get(i);
            }

            return arr;

        }
    }
}
