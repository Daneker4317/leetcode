package leetcode.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
    }

    public String frequencySort(String s) { // 451. Sort Characters By Frequency
        StringBuilder sb = new StringBuilder();
        new HashMap<Character, Integer>() {{
            for (char ch : s.toCharArray())
                compute(ch, (k, v) -> (v == null) ? 1 : ++v);
            this.entrySet().stream()
                    .sorted(Collections.reverseOrder
                            (Map.Entry.comparingByValue())
                    )
                    .forEach(entry -> {
                        int c = 0;
                        while (c < entry.getValue()) {
                            sb.append(entry.getKey());
                            c++;
                        }
                    });
        }};
        return sb.toString();
    }
}
