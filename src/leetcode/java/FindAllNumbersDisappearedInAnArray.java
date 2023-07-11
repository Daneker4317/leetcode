package leetcode.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        IntPredicate arrayContains = n ->
                Arrays.stream(nums).anyMatch(a -> a == n);
        return new ArrayList<>() {{
            IntStream.range(1, nums.length).filter(arrayContains).forEach(this::add);
        }};
    }
}
