package leetcode.java;

public class DeepestLeavesSum {
    int deepestLeavesSum(TreeNode root) {
        return dfs(root, 1, depth(root), 0);
    }

    int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

    int dfs(TreeNode root, int currentLevel, int depth, int sum) {
        if (root == null) {
            return 0;
        }
        if (currentLevel == depth) {
            sum += root.val;
            return sum;
        }
        return dfs(root.left, currentLevel + 1, depth, sum)
                +
                dfs(root.right, currentLevel + 1, depth, sum);
    }
}
