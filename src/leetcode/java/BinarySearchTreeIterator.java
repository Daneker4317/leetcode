package leetcode.java;

import javax.swing.tree.TreeCellRenderer;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTreeIterator {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    class BSTIterator {
        Queue<Integer> queue;
        public BSTIterator(TreeNode root){
            this.queue = new ArrayDeque<>();
            addAll(root);
        }

        public int next() {
            return queue.poll();
        }

        public boolean hasNext() {
            return !queue.isEmpty();
        }

        public void addAll(TreeNode root) {
            if (root == null) {
                return;
            }
            addAll(root.left);
            queue.add(root.val);
            addAll(root.right);
        }
    }
}
