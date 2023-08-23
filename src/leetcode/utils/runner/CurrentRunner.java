package leetcode.utils.runner;


import java.util.*;

public class CurrentRunner {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
    }


    public int[] canSeePersonsCount(int[] heights) {
        int[] res = new int[heights.length];
        for (int i = 0; i < heights.length - 1; i++) {
            int currentCounter = 0;
            int currentMin = 0;
            for (int j = i + 1; j < heights.length; j++) {
                res[i] = 0;
                if (heights[j] > heights[i] || heights[j] < currentMin) {
                    res[i] = currentCounter;
                    break;
                }
                if (heights[j] < heights[i] && heights[j] > currentMin) {
                    currentMin = heights[j];
                    currentCounter++;
                }
            }
        }

        return res;
    }

}
