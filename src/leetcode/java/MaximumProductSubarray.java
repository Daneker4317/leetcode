package leetcode.java;

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int n = nums.length;

        int left = 0, right = 0; // two pointers

        int answer = 0;

        for (int i = 0; i < n; i++) {
            left = left == 0 ? 1 : left;
            right = right == 0 ? 1 : right;

            left *= nums[i];
            right *= nums[n - i - 1];

            System.out.println("left=" + left + " right=" + right);

            answer = Math.max(answer, Math.max(left, right));

        }

        return answer;
    }
}
