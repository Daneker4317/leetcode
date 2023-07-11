package leetcode.java;

import java.util.Arrays;
import java.util.function.Function;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        return types.apply(candyType) == 1 ? 1 : Math.min(candyType.length / 2, types.apply(candyType));
    }

    private final Function<int[], Integer> types =
            a -> (int) Arrays.stream(a).distinct().count();
}
