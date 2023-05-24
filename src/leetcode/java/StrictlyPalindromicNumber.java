package leetcode.java;

import java.util.stream.Stream;

public class StrictlyPalindromicNumber {
    public boolean isStrictlyPalindromic(int n) {
        return Stream.iterate(2, i -> i < n - 1, i -> i + 1)
                .map(el -> Integer.toString(n, el))
                .noneMatch(this::isPalindrome);
    }

    public boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
