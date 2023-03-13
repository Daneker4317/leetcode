package leetcode.java;

import leetcode.utils.ListNode;

import java.util.ArrayList;
import java.util.List;


public class MaximumTwinSumofaLinkedList {
        public int pairSum(ListNode head) {
        ListNode node = head;
        List<Integer> list = new ArrayList<>();
        while(node!=null){
          list.add(node.val);
          node = node.next;
        }
        int result = 0;
        int i = 0;
        int j = list.size() - 1;
        while(i < j){
          if(list.get(i) + list.get(j) > result){
            result = list.get(i) + list.get(j);
          }
          i++;
          j--;
        }
        System.out.println(list);
        return result;
    }
}
