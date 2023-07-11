package leetcode.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occurrences = new HashMap<>(){{
            Arrays.stream(arr).forEach(num -> {
                compute(num , (k,v) -> (v == null) ? 1 : ++v);
            });
        }};
        for (int value : occurrences.values()) {
            if (occurrences.values().stream().filter(v -> v == value).count() > 1) {
                return false;
            }
        }
        return true;
    }
}
