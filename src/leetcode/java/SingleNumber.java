package leetcode.java;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        for(int key:nums){
            if((oneTime(key,nums)))return key;
        }
        return 1;
    }
    public boolean oneTime(int a,int arr[]){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                count++;
            }
        }
        return count==1;
    }
}
