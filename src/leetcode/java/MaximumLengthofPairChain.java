package leetcode.java;

import java.util.Arrays;

public class MaximumLengthofPairChain {
        public int findLongestChain(int[][] pairs) {

         Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int [] last = pairs[0];

        int counter = 1;
        for(int i=0; i < pairs.length;i++){
          if(pairs[i][0] > last[1]){
            counter ++;
            last =  pairs[i];
          }
        }

        return counter;
    }
}
