package leetcode.java;

import leetcode.utils.ListNode;

public class ConvertBinaryNumberinaLinkedListtoInteger {
        public int getDecimalValue(ListNode head) {
      ListNode cursor;
      StringBuilder sb = new StringBuilder();
    for (cursor = head; cursor != null; cursor = cursor.next) {
        sb.append(cursor.val);
    }
    return Integer.parseInt(sb.toString(),2);
    }
}
