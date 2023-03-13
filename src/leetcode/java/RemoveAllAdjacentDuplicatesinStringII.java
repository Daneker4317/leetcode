package leetcode.java;

import java.util.*;
public class RemoveAllAdjacentDuplicatesinStringII {
        public String removeDuplicates(String s, int k) {
        Stack<int[]> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek()[0] != c) {
                stack.push(new int[] {c, 1});
            } else {
                stack.peek()[1]++;
                if (stack.peek()[1] == k) {
                    stack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int[] c : stack) {
            sb.append(String.valueOf((char) c[0]).repeat(Math.max(0, c[1])));
        }
        return sb.toString();
    }
}
