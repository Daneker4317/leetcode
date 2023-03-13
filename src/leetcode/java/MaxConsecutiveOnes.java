package leetcode.java;

public class MaxConsecutiveOnes {
        public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int res = 0;
       for(int i : nums){
         if(i == 1){
           counter ++;
            res = Math.max(res,counter);
         }else counter = 0;
       }
       return res;
    }
}
