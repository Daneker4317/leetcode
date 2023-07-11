package leetcode.java;

public class CountPairsOfSimilarStrings {
    public int similarPairs(String[] words) {
        int counter = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (contains(words[i], words[j]) && contains(words[j], words[i])) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public boolean contains(String s, String t) {
        for (int i = 0; i < t.length(); i++) {
            if (!s.contains(String.valueOf(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
