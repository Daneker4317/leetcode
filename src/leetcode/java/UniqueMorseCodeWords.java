package leetcode.java;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        return new HashSet<>() {{
            Arrays.stream(words).forEach(word -> {
                StringBuilder sb = new StringBuilder();
                for (char ch : word.toCharArray()) {
                    sb.append(convert(ch));
                }
                add(sb.toString());
            });
        }}.size();
    }

    public String convert(char ch) {
        final String[] array = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        final String str = "abcdefghijklmnopqrstuvwxyz";
        return array[str.indexOf(ch)];
    }
}
