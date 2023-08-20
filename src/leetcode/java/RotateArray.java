package leetcode.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] rotated = IntStream
                .concat(Arrays.stream(nums).skip(n - k),
                        Arrays.stream(nums).limit(n - k)
                ).toArray();
        System.arraycopy(rotated, 0, nums, 0, n);
    }


}
