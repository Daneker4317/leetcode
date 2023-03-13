package leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
      public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        dfs(list1,root1);
        dfs(list2,root2);

        return list1.equals(list2);
    }

    private void dfs(List<Integer> list , TreeNode root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            list.add(root.val);
        }


        dfs(list,root.left);
        dfs(list,root.right);


    }
}
