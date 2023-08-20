package leetcode.java;

import java.util.*;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int value : nums) {
            if (notMoreThanTwo(list, value)) {
                list.add(value);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
    public boolean notMoreThanTwo(List<Integer> list, int value) {
        return list.stream().filter(m -> m == value).count() < 2;
    }
}
