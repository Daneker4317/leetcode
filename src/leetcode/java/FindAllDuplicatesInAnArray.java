package leetcode.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        return new ArrayList<>(
                new HashSet<>() {{
                    Arrays.sort(nums);
                    for (int i = 0; i < nums.length; i++) {
                        if (nums[i] == nums[i + 1]) {
                            add(nums[i]);
                        }
                    }
                }}
        );
    }
}
