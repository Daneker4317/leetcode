package leetcode.java;

import java.util.Arrays;
import java.util.function.BiFunction;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] out = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            out[i] = res.apply(nums[i], nums);
        }
        return out;
    }

    private final BiFunction<Integer, int[], Integer> res = (key, arr) -> (int) Arrays.stream(arr).filter(a -> a > key).count();
}
