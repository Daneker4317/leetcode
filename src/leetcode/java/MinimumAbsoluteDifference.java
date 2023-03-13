package leetcode.java;
import java.util.*;
public class MinimumAbsoluteDifference {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
    Arrays.sort(arr);
     List<List<Integer>> list = new ArrayList<>();
     int minDiff = Integer.MAX_VALUE;
     for(int i=0;i<arr.length-1;i++){
       int diff = arr[i+1] - arr[i];
       if(diff<minDiff){
         minDiff = diff;
         list.clear();
       }
       if(diff == minDiff){
         list.add(Arrays.asList(arr[i] , arr[i+1]));
       }
     }
       return list;
    }
}
