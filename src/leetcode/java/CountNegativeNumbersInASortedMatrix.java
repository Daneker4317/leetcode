package leetcode.java;

import java.util.Arrays;

public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        return Arrays.stream(grid).mapToInt(arr -> (int) Arrays.stream(arr).filter(num -> num < 0).count()).sum();
    }
}
