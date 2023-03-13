package leetcode.java;

import java.util.Arrays;

public class SquaresofaSortedArray {
        public int[] sortedSquares(int[] nums) {
      for(int i=0;i<nums.length;i++){
          nums[i] = Math.abs(nums[i]);
      }
      Arrays.sort(nums);
      int res [] = new int [nums.length];
      for(int i=0;i<nums.length;i++){
          res [i] = (int)Math.pow(nums[i],2);
      }
      return res;
    }
}
