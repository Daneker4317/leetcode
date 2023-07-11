package leetcode.java;

import java.util.Arrays;
import java.util.function.Predicate;

public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        return (int) Arrays.stream(operations).filter(check).count();
    }

    private final Predicate<String> check = s -> s.charAt(1) == '+';
}
