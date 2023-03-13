package leetcode.java;

import java.util.Arrays;

public class FindtheHighestAltitude {
        public int largestAltitude(int[] gain) {
        int [] arr = new int [gain.length + 1];
        arr[0] = 0 ;
        for(int i = 1,c=0;i< arr.length; i++){
                    arr[i]  = arr[i-1] + gain[c];
          c++;
        }
        System.out.print(Arrays.toString(arr));
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
