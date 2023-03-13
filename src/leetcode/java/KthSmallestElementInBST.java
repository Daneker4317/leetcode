package leetcode.java;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class KthSmallestElementInBST {
    class Solution {
    int counter = 0;
    int result = 0;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root , k);
        return result;
    }
    void dfs(TreeNode root , int k){
      if(root == null){
        return;
      }

      dfs(root.left , k);
      counter ++;
      if(counter == k){
        result = root.val;
        return;
      }
      dfs(root.right , k);
    }
}
}
