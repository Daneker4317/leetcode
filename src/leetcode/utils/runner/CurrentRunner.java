package leetcode.utils.runner;


import java.util.Arrays;

public class CurrentRunner {
    public static void main(String[] args) {

    }
    public int thirdMax(int[] nums) {
        nums = Arrays.stream(nums)
                .sorted()
                .distinct()
                .toArray();

        return nums.length <= 2 ? nums[nums.length - 1] : nums[nums.length - 2];
    }

}
