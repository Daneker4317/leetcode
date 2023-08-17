package leetcode.java;

import leetcode.utils.ListNode;

public class RemoveDuplicatesFromSortedList {
    public String removeOccurrences(String s, String part) {
        String replaced = s.replaceFirst(part, "");

            return replaced.length() == s.length() ? replaced : removeOccurrences(replaced, part);
    }
}
