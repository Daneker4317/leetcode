package leetcode.java;

import java.util.Arrays;

public class HeightChecker {
        public int heightChecker(int[] heights) {
        int [] SortedArray = new int [heights.length];
        System.arraycopy(heights, 0, SortedArray, 0, heights.length);
        Arrays.sort(SortedArray);
        int count = 0;
        for(int i=0;i<SortedArray.length;i++){
            if(SortedArray[i]!=heights[i]){
                count = count + 1;
            }
        }
        return count;
    }
}
