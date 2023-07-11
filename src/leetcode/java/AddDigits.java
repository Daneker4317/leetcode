package leetcode.java;

public class AddDigits {
    public int addDigits(int num) {
        int count;
        int sum = 0;
        if (num < 10) {
            return num;
        }
        for (int num1 = num; num1 > 0; num1 /= 10) {
            count = num1 % 10;
            sum += count;
        }
        return addDigits(sum);
    }
}
