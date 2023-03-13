package leetcode.java;

public class LargestPositiveIntegerThatExistsWithitsNegative {
    public int findMaxK(int[] nums) {
        int r = -1;
        for(int k : nums){
            for(int i=0;i<nums.length;i++){
                if(k==nums[i]*-1 && k>r){
                    r = k;
                }
            }
        }
        return r;
    }
}
