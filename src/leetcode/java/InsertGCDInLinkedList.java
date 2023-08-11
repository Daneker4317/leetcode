package leetcode.java;

import leetcode.utils.ListNode;

public class InsertGCDInLinkedList {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode n = head;

        while (n.next != null) {
            int val = gcd(n.val, n.next.val);
            ListNode newNode = new ListNode(val);

            ListNode temp = n.next;
            n.next = newNode;
            newNode.next = temp;

            n = n.next.next;
        }

        return head;
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
