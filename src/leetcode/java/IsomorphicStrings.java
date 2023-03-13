package leetcode.java;
import java
        .util.*;
public class IsomorphicStrings {
        public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapping = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (mapping.containsKey(c1)) {
                if (mapping.get(c1) != c2) {
                    return false;
                }
            } else {
                if (mapping.containsValue(c2)) {
                    return false;
                }
                mapping.put(c1, c2);
            }
        }
        return true;
    }
}
