package leetcode.java;

import java.util.stream.IntStream;

public class SumOfNumberAndItsReverse {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0){
            return true;
        }
        return IntStream.iterate(1 , i -> i < num, i -> i+1)
                .anyMatch(i -> i + reverse(i) == num);
    }
    int reverse(int n){
        return Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
    }
}
