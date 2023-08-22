package leetcode.java;

import java.util.Arrays;

public class ReducingDishes {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);

        int max = 0;

        for (int i = 0; i < satisfaction.length; i++) {
            int sum = 0;
            int cook = 1;
            for (int j = i; j < satisfaction.length; j++) {
                sum += satisfaction[j] * cook;
                cook++;
            }
            max = Math.max(sum, max);
        }

        return max;

    }
}
