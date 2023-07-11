package leetcode.java;

public class FindThePivotInteger {
    public int pivotInteger(int n) {
        int left = 0;
        int right = 0;
        for (int i = 1; i <= n; i++) {
            left += i;
            for (int j = i + 1; j <= n; j++) {
                right += j;
            }
            if (right == left) {
                return i;
            }
        }
        return -1;
    }
}
