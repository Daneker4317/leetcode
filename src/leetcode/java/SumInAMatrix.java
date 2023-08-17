package leetcode.java;

import java.util.Arrays;

public class SumInAMatrix {
    public int matrixSum(int[][] nums) {
        Arrays.stream(nums).forEach(Arrays::sort);

        int [] max = new int[nums[0].length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                max[j]=Math.max(max[j],nums[i][j]);
            }
        }


        return Arrays.stream(max).sum();
    }
}
