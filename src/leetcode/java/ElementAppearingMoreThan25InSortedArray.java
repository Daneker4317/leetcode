package leetcode.java;

public class ElementAppearingMoreThan25InSortedArray {
    public int findSpecialInteger(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int res = arr.length / 4 + 1;
        for (int k : arr) {
            for (int j = 1; j < arr.length; j++) {
                if (k == arr[j]) {
                    res--;
                    if (res <= 0) {
                        return k;
                    }
                } else {
                    res = arr.length / 4 + 1;
                }
            }
        }
        return 1;
    }
}
