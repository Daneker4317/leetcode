package leetcode.java;

public class SumofUniqueElements {
        public int sumOfUnique(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(res(nums,nums[i])){
                sum = sum + nums[i];
            }
        }
        return sum;
    }
    public boolean res(int [] nums , int key){
        int c = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==key){
                c = c + 1;
            }
        }
        return c==1;
    }
}
