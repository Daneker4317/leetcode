package leetcode.java;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
        public String longestCommonPrefix(String[] arr) {

        StringBuilder sb = new StringBuilder();

        String word = Arrays.stream(arr).min(Comparator.comparing(String::length)).get();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < word.length(); j++) {
                if (check(word.charAt(j), arr, j)) {
                    sb.append(word.charAt(j));
                } else {
                    return sb.toString();
                }
            }
        }
         return sb.substring(0 , sb.length() / arr.length);
    }

    public static boolean check(char ch, String[] arr, int index) {
        return Arrays.stream(arr).allMatch(s -> s.charAt(index) == ch);
    }
}
