package leetcode.java;

public class CountNumberofPairsWithAbsoluteDifferenceK {
public int countKDifference(int[] nums, int k) {
      int counter = 0;

      for(int i=0;i<nums.length-1;i++){
        for(int j = i+1;j<nums.length;j++){
          if((int)Math.abs(nums[i]-nums[j]) == k){
            counter++;
          }
        }
      }
      return counter;
    }
}
