package leetcode.java;

public class PeekIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i + 1] < arr[i]) {
                return i;
            }
        }
        return 0;
    }

}
