package leetcode.java;

import java.util.*;

public class ConvertTo2DArrayWithConditions {
    boolean[] visited;
    List<List<Integer>> list;

    public List<List<Integer>> findMatrix(int[] nums) {
        list = new ArrayList<>();
        visited = new boolean[nums.length];

        distinct(nums);

        return list;
    }

    void distinct(int[] arr) {

        Set<Integer> set = new HashSet<>();

        boolean isFinished = true;
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i] && !set.contains(arr[i])) {
                set.add(arr[i]);
                visited[i] = true;
                isFinished = false;
            }
        }

        if (isFinished){
            return;
        }

        list.add(new ArrayList<>(set));

        distinct(arr);
    }
}
