package leetcode.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, List<Integer>> patternMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (patternMap.containsKey(ch)) {
                patternMap.get(ch).add(i);
            } else patternMap.put(ch, new ArrayList<>(List.of(i)));
        }

        String[] split = s.split(" ");
        Map<String, List<Integer>> splitMap = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            String str = split[i];
            if (splitMap.containsKey(str)) {
                splitMap.get(str).add(i);
            } else {
                splitMap.put(str, new ArrayList<>(List.of(i)));
            }
        }

// FIXME: 5/29/2023 -        return patternMap.values().equals(splitMap.values());
        return false;
    }
}
