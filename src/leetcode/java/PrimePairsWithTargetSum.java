package leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class PrimePairsWithTargetSum {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=3; i<=n/2; i+=2){
            if(isPrime(i) && isPrime(n-i)){
                list.add(List.of(i , n-i));
            }
        }
        if(isPrime(n-2)){
            list.add(List.of(2,n-2));
        }
        System.out.println(list);
        return list;
    }

    Boolean isPrime(int n){
        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
