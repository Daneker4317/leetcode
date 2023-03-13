package leetcode.java;

import java.util.*;

public class SumIII {
      public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    list.add(List.of(nums[i] , nums[left] , nums[right]));
                    left++;
                    while (nums[left-1] == nums[left] && left < right){
                        left++;
                    }
                } else if (sum > 0) {
                    right--;
                }else left++;
            }
        }
        return list;
    }
}
