package leetcode.java;

import java.util.Arrays;
import java.util.function.Predicate;

public class FindFirstPalindromicStringInTheArray {
    public String firstPalindrome(String[] words) {
        return Arrays.stream(words).filter(isPalindrome)
                .toList().stream().findFirst().orElse("");
    }

    private final Predicate<String> isPalindrome = str -> str.contentEquals(new StringBuilder(str).reverse());
}
