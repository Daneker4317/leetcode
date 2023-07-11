package leetcode.java;

import java.util.Arrays;
import java.util.function.Predicate;

class CountPrefixesOfAGivenString {
    public int countPrefixes(String[] words, String s) {
        Predicate<String> isPrefix = t -> {
            if (t.length() < s.length()) {
                return false;
            }
            return t.startsWith(s);
        };
        return (int) Arrays.stream(words).filter(isPrefix).count();
    }
}