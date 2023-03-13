package leetcode.java;

import java.util.*;

public class RearrangeArrayElementsbySign {
        public int[] rearrangeArray(int[] arr) {
         List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int value:arr) {
            if (value > 0) {
                pos.add(value);
            } else {
                neg.add(value);
            }
        }
        int k = 0;
        int j = 0;
        for (int i = 0; i < arr.length-1; i+=2) {
            arr[i] = pos.get(k++);
            arr[i+1] = neg.get(j++);
        }
        return arr;
    }
}
