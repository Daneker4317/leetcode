package leetcode.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        return new HashMap<Integer, Integer>() {{
            Arrays.stream(nums).forEach(n -> {
                compute(n, (a, b) -> (a == null) ? 1 : ++b);
            });
        }}
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList()
                .stream()
                .reduce(Integer::sum)
                .orElse(0);
    }
}
