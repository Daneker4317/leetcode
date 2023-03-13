package leetcode.java;

import java.util.*;

public class KthSmallestElementinaSortedMatrix {
        public int kthSmallest(int[][] matrix, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        Arrays.stream(matrix).forEach(arr -> Arrays.stream(arr).forEach(set::add));
        return new ArrayList<>(set).get(k-1);
    }
}
