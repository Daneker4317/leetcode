package leetcode.utils.runner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,2,3,3,3};
        Map<Integer , Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, count(j, arr));
        }
        System.out.println(map);
    }

    private static int count(int el , int [] arr){
        int counter = 0;
        for (int j : arr) {
            if (j == el) {
                counter++;
            }
        }
        return counter;
    }

}
