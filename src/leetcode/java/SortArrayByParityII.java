package leetcode.java;


import java.util.*;

public class SortArrayByParityII {
        public int[] sortArrayByParityII(int[] arr) {
         List<Integer> odd = new ArrayList<>();
        List<Integer>  even = new ArrayList<>();

        for (int value:arr) {
            if (value %2 == 0) {
                even.add(value);
            } else {
                odd.add(value);
            }
        }
        int k = 0;
        int j = 0;
        for (int i = 0; i < arr.length-1; i+=2) {
            arr[i] = even.get(k++);
            arr[i+1] = odd.get(j++);
        }
        return arr;
    }

}
