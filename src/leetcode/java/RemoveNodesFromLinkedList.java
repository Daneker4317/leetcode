package leetcode.java;

import leetcode.utils.ListNode;

public class RemoveNodesFromLinkedList {
        public ListNode removeNodes(ListNode head) {
    if(head==null || head.next==null ){
        return null;
    }
    ListNode nextNode = removeNodes(head.next);
    if(nextNode.val > head.val){
        return nextNode;
    }
    head.next  = nextNode;
    return head;
    }
}
