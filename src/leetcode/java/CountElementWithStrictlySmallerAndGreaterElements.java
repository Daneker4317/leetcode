package leetcode.java;

import java.util.Arrays;

public class CountElementWithStrictlySmallerAndGreaterElements {
 public int countElements(int[] nums) {

      if(Arrays.stream(nums).distinct().count()==1){
          return 0;
      }

      if(nums.length < 3)return 0;
        Arrays.sort(nums);

        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length;i++){
          if(nums[i]!=nums[i+1]){
              start = i;
              break;
          }
        }
        for(int i = nums.length-1; i >= 1;i--){
          if(nums[i]!=nums[i-1]){
              end = i;
              break;
          }
        }

        return end - start - 1;
    }
}
