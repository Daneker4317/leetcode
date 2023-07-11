package leetcode.java;
import java.util.*;
public class FindTheDifferenceOfTwoArrays {
       public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();
        for (int num : nums1) {
            n1.add(num);
        }
        for (int num : nums2) {
            n2.add(num);
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(check(n1,n2));
        result.add(check(n2,n1));
        return result;
    }
    public List<Integer> check(List<Integer> n1 , List<Integer> n2){
      List<Integer> list = new ArrayList<>();
        for (int num : n1) {
            if (!n2.contains(num) && !list.contains(num)) {
                list.add(num);
            }
        }
        return list;
    }
}
