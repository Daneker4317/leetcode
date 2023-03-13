package leetcode.java;

public class NRepeatedElementinSize2NArray {
        public int repeatedNTimes(int[] nums) {
        int value = nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(CountDublicats(nums,nums[i])){
                return nums[i];
            }
        }
        return 0;
    }
    public boolean CountDublicats(int []a, int  key){
                int value = a.length/2;
                int count = 0 ;
                for(int i=0;i<a.length;i++){
                    if(a[i]==key){
                        count = count + 1;
                    }
                }
                return count==value;

    }
}
