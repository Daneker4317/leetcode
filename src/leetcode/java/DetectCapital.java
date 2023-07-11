package leetcode.java;

import java.util.function.Predicate;

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        return res(word);
    }

    public static boolean res(String str) {
        return allUpper.test(str) || allLower.test(str) || oneCapital.test(str);
    }

    private static final Predicate<String> allLower = str -> str.equals(str.toLowerCase());
    private static final Predicate<String> allUpper = str -> str.equals(str.toUpperCase());

    public static Predicate<String> oneCapital = str -> {
        for (int i = 1; i < str.length(); i++) {
            if (!Character.isLowerCase(str.charAt(i)))
                return false;
        }

        return Character.isUpperCase(str.charAt(0));
    };
}
