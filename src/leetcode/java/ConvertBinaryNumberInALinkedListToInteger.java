package leetcode.java;

import leetcode.utils.ListNode;

public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        for (ListNode cursor = head; cursor != null; cursor = cursor.next) {
            sb.append(cursor.val);
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
