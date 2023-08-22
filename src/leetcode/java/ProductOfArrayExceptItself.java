package leetcode.java;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public int[] productExceptSelf(int[] arr) {
        var res = new int[arr.length];
        Arrays.fill(res, 1);

        int prefix = 1;

        for (int i = 0; i < arr.length; i++) {
            res[i] = prefix;
            prefix *= arr[i];
        }

        int postfix = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= arr[i];
        }

        return res;
    }
}
