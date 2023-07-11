package leetcode.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CheckIfNumbersAreAscendingInASentence {
    public boolean areNumbersAscending(String s) {
        Predicate<String> isDigit = str -> {
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    return false;
                }
            }
            return true;
        };
        List<Integer> list = Arrays
                .stream(s.split(" "))
                .filter(isDigit)
                .map(Integer::parseInt)
                .toList();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
