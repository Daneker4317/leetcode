package leetcode.java;

import java.util.*;

public class SortTheStudentsByTheirKthScore {
    public static int[][] sortTheStudents(int[][] score, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < score.length; i++){
            map.put(score[i][k],i);
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        int index = score.length-1;
        int[][] massiv = new int[score.length][score[0].length];
        for (Map.Entry<Integer, Integer> entry : entries) {
            massiv[index--] = score[entry.getValue()];
        }
        return massiv;
    }
}
