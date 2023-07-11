package leetcode.java;

public class FindGreatestCommonDivisorOfArray {
    public static long gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
            }
            if (nums[i] <= min) {
                min = nums[i];
            }
        }
        return (int) gcd(min, max);
    }
}
