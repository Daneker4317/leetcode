package leetcode.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTriangularSumOfAnArray {
    public int triangularSum(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        return eval(list);
    }

    public int eval(List<Integer> list) {
        if (list.size() == 1) {
            return list.get(0) % 10;
        }
        List<Integer> inner = new ArrayList<>();

        for (int i = 0; i < list.size() - 1; i++) {
            inner.add(list.get(i) % 10 + list.get(i + 1) % 10);
        }
        return eval(inner);
    }
}
