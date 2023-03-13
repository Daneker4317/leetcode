package leetcode.java;

public class RootEqualsSumofChildren {
     public boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }
}
