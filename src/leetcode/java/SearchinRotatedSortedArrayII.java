package leetcode.java;

import java.util.Arrays;

public class SearchinRotatedSortedArrayII {
        public boolean search(int[] nums, int target) {
            return Arrays.stream(nums).anyMatch(n -> n == target);
    }
}
