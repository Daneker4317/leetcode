package leetcode.java;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    class Solution {
  List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorderRecursive(root);
        return list;
            }
   void inorderRecursive(TreeNode root) {
        if (root != null){
            inorderRecursive(root.left);
            list.add(root.val);
            inorderRecursive(root.right);
        }
    }
}
}
