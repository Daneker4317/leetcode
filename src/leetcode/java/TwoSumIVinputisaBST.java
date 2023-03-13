package leetcode.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoSumIVinputisaBST {
        public boolean findTarget(TreeNode root, int target) {
        List<Integer> list = new ArrayList<>();
        treeItemsToList( root, list );
        Collections.sort(list);

        int i = 0;
        int j =list.size()-1 ;

       while( i < j ){
       if((list.get(i) + list.get(j)) == target){
         return true;
       }
       if((list.get(i) + list.get(j)) > target){
         j--;
       }else{
         i++;
       }
     }
        System.out.println(list);
        return false;
    }
   public void treeItemsToList(TreeNode node, List<Integer> list ){
        if(node == null){
            return;
        }
        treeItemsToList(node.left, list);
        list.add(node.val);
        treeItemsToList(node.right, list);
    }
}
