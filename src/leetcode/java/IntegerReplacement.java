package leetcode.java;

public class IntegerReplacement {
        public int integerReplacement(int n1) {
        int steps = 0;
        long n =  n1;
        while (n != 1) {
            if(n % 2 == 0) {
                n = n / 2;
            } else {
                long left = (n - 1) / 2;
                if(left == 1 || left % 2 == 0) {
                    n = n - 1;
                } else {
                    n = n + 1;
                }
            }
            steps++;
        }

        return steps;
    }
}
