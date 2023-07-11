package leetcode.java;

import leetcode.utils.ListNode;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        int length = length(head);
        System.out.println(length);
        int ind = length % 2 == 0 ? (length + 1) / 2 : length / 2;
        ListNode n = head;
        while (ind > 0) {
            n = n.next;
            --ind;
        }
        return n;
    }

    int length(ListNode head) {
        int len = 0;
        ListNode n = head;
        while (n != null) {
            len++;
            n = n.next;
        }
        return len;
    }
}
