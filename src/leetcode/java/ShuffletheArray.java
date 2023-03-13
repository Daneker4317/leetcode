package leetcode.java;

public class ShuffletheArray {
     public int[] shuffle(int[] nums, int n) {
        int [] arr = new int [n*2];
        int x = 0;
        for(int i = 0;i < arr.length;i++) {
            arr[i] = i % 2 == 0 ? nums[x++] : nums[n++];
        }
        return arr;
}
}
