package leetcode.java;

public class OptimalPartitionOfString {
    public int partitionString(String s) {
        int[] hash = new int[26];
        int counter = 1;

        for (int i = 0; i < s.length(); i++) {
            if (hash[s.charAt(i) - 'a'] == 1) {
                counter++;
                hash = new int[26];
            }
            hash[s.charAt(i) - 'a']++;
        }

        return counter;
    }
}
