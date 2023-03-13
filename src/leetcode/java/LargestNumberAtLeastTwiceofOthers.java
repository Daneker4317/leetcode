package leetcode.java;

import java.util.Arrays;

public class LargestNumberAtLeastTwiceofOthers {
    public int dominantIndex(int[] nums) {
        int [] arr = new int [nums.length];
        for(int i=0;i<nums.length;i++){
          arr[i] = nums[i];
        }
        Arrays.sort(nums);
        int index = -1;
        if(nums[nums.length-1] >= 2*nums[nums.length-2]){
          index = nums[nums.length-1];
        }
        if(index==-1)return index;
        for(int i = 0;i<arr.length;i++){
          if(arr[i] == index){
            return i;
          }
        }
        return -1;

    }
}
