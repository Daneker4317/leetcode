package leetcode.java;

public class ApplyOperationsToAnArray {
    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }

        int[] result = new int[nums.length];
        int k = 0;

        for (int num : nums) {
            if (num != 0)
                result[k++] = num;
        }

        return result;
    }
}
