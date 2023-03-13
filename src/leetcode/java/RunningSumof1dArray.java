package leetcode.java;

public class RunningSumof1dArray {
        public int[] runningSum(int[] nums) {
        int res[] = new int[nums.length];
        for(int i=0;i<res.length;i++){
            for(int j=0;j<=i;j++){
                res[i]+=nums[j];
            }
        }
        return res;
    }
}
