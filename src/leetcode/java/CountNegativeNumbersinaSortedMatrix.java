package leetcode.java;

import java.util.Arrays;

public class CountNegativeNumbersinaSortedMatrix {
    public int countNegatives(int[][] grid) {
         int counter = 0;
        for(int [] arr : grid){
            counter += Arrays.stream(arr).filter(num -> num < 0).count();
        }
        return counter;
    }
}
