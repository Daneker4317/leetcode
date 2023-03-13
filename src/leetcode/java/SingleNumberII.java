package leetcode.java;

import java.util.Arrays;

public class SingleNumberII {
        public int singleNumber(int[] nums) {
        return Arrays.stream(nums).filter(value -> oneTime(value , nums)).findFirst().orElse(1);
    }
    public boolean oneTime(int a,int arr[]){
            return Arrays.stream(arr).filter(value -> value == a).count() == 1;
    }
}
