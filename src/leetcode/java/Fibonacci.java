package leetcode.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fib(n));
    }
    static Map<Integer , Integer> map = new HashMap<>(){{
        put(0,0);
        put(1,1);
    }};
    public static int fib(int n){
        if (n <=1){
            return n;
        }
        for (int i = 2; i <= n; i++) {
            map.put(i , map.get(i-2) + map.get(i-1));
        }
        return map.get(n);
    }
}
