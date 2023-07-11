package leetcode.java;

import java.util.Arrays;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        return (int) Arrays.stream(nums).mapToObj(String::valueOf).filter(s -> s.length() % 2 == 0).count();
    }
}
