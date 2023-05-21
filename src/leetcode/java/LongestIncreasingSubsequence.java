package leetcode.java;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int [] arr = new int[nums.length];
        Arrays.fill(arr , 1);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && arr[i] < arr[j] + 1) {
                    arr[i] = arr[j] + 1;
                }
            }
        }
        return Arrays.stream(arr).min().orElse(0);
    }
}
