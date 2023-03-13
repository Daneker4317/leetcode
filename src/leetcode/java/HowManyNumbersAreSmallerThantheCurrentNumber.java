package leetcode.java;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] out = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            out[i] = res(nums[i],nums);
        }
        return out;
    }
    public int res  (int key,int arr[]){
        int count = 0;
        for(int i : arr){
            if(i<key){
                count++;
            }
        }
        return count;
    }
}
