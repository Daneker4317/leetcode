package leetcode.java;

import java.util.Arrays;
import java.util.HashSet;

public class CountNumberOfDistinctIntegersAfterReverseOperations {
    public int countDistinctIntegers(int[] nums) {
        return new HashSet<Integer>() {{
            Arrays.stream(nums).forEach(el -> {
                add(el);
                add(reversed(el));
            });
        }}.size();
    }

    public int reversed(int value) {
        return Integer.parseInt(new StringBuilder(""+value).reverse().toString());
    }
}
