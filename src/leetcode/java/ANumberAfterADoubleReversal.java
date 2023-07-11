package leetcode.java;

public class ANumberAfterADoubleReversal {
    public boolean isSameAfterReversals(int num) {
        if (num % 10 == 0 && num != 0) {
            while (num % 10 != 0) {
                num = num / 10;
            }
        }
        return num == reverse(reverse(num));
    }

    public int reverse(int n) {
        return Integer.parseInt(new StringBuilder(n + "").reverse().toString());
    }
}
