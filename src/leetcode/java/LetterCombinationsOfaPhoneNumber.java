package leetcode.java;

import java.util.*;

public class LetterCombinationsOfaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.equals("")) return ans;
        Map<Integer, String[]> map = new HashMap<>() {{
            put(1, new String[]{});
            put(2, new String[]{"a", "b", "c"});
            put(3, new String[]{"d", "e", "f"});
            put(4, new String[]{"g", "h", "i"});
            put(5, new String[]{"j", "k", "l"});
            put(6, new String[]{"m", "n", "o"});
            put(7, new String[]{"p", "q", "r", "s"});
            put(8, new String[]{"t", "u", "v"});
            put(9, new String[]{"w", "x", "y", "z"});
        }};


        for (int i = 0; i < digits.length(); i++) {
            int digit = Character.getNumericValue(digits.charAt(i));
            String[] letters = map.get(digit);
            if (ans.size() == 0) {
                ans.addAll(Arrays.asList(letters));
                continue;
            }
            List<String> sub = new ArrayList<>();
            for (String an : ans) {
                for (String letter : letters) {
                    sub.add(an + letter);
                }
            }
            ans = sub;
        }
        return ans;
    }

}
