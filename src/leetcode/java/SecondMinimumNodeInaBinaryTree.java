package leetcode.java;

import leetcode.java.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondMinimumNodeInaBinaryTree {
    class Solution {
    int counter = 0;
    int daneker = 0;
    Set<Integer> set = new TreeSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        dfs(root);
        List<Integer> list = new ArrayList<>(set);
        System.out.print(list);
        return list.size() > 1 ? list.get(1) : -1;
    }
    public void dfs(TreeNode root){
      if(root==null){
        return;
      }
      dfs(root.left);
      set.add(root.val);
      dfs(root.right);
    }
}
}
