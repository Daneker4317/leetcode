package leetcode.java;

import leetcode.utils.ListNode;

import java.util.*;

public class PalindromeLinkedList {
     public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        List<Integer> list = new ArrayList<>();
        while(node!=null){
          list.add(node.val);
          node = node.next;
        }
        int i = 0;
        int j = list.size() - 1;
        while(i < j){
          if(list.get(i) != list.get(j)){
           return false;
          }
          i++;
          j--;
        }
        return true;
    }
}
