package leetcode.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumFourDivisors {
    public int sumFourDivisors(int[] nums) {
        return Arrays.stream(nums)
                .map(this::divisorsSum)
                .sum();
    }

    int divisorsSum(int n) {
        Set<Integer> set = new HashSet<>(List.of(1, n));

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                set.addAll(List.of(i, n / i));
            }
            if (set.size() > 4) {
                break;
            }
        }

        if (set.size() != 4) {
            return 0;
        }
        System.out.println(set);

        return set.stream().reduce(Integer::sum).get();
    }
}
