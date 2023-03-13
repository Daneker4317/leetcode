package leetcode.java;
import java.util.*;
public class RemoveElement {
       public int removeElement(int[] nums, int val) {
       List<Integer> list =  new LinkedList<>();
       for(int key : nums){
            if(key!=val){
                list.add(key);
            }
       }
       for(int i=0;i<list.size();i++){
         nums[i] = list.get(i);
       }
        return list.size();
    }
}
