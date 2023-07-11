package leetcode.java;

import java.util.function.BiFunction;

public class GenerateAStringWithCharactersThatHaveOddCounts {
    public String generateTheString(int n) {
        if (n == 1) {
            return "a";
        }
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            sb.append(generate.apply(n - 1, "x")).append(generate.apply(1, "y"));
        } else {
            sb.append(generate.apply(n - 2, "x")).append(generate.apply(1, "y")).append(generate.apply(1, "z"));
        }
        return sb.toString();
    }

    private final BiFunction<Integer, String, String> generate = (a, s) -> s.repeat(a);
}
