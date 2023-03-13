package leetcode.java;

public class MonotonicArray {
        public boolean isMonotonic(int[] nums) {
        if(sort1(nums))return true;
        if(sort2(nums))return true;
        return false;
    }
    public boolean sort1(int a[]){
        if (a == null || a.length <= 1) {
            return true;
        }
        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
        public boolean sort2(int a[]){
        if (a == null || a.length <= 1) {
            return true;
        }
        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] < a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
