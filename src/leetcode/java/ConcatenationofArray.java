package leetcode.java;

public class ConcatenationofArray {
      public int[] getConcatenation(int[] nums) {
        int [] arr = new int[nums.length * 2];
        int n = nums.length;
        for(int i = 0; i < nums.length;i++){
          arr[i] = arr[i+n] = nums[i];
        }
        return arr;
    }
}
