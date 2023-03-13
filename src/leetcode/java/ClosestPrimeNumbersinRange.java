package leetcode.java;

import java.util.*;

public class ClosestPrimeNumbersinRange {
        public int[] closestPrimes(int left, int right) {
        int [] res = new int [2];
        res[0] = -1;
        res[1] = -1;

        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
          if(prime(i)){
            list.add(i);
          }
        }

        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
          if((list.get(i+1) - list.get(i))<min){
            min =  list.get(i+1) - list.get(i);
            res[0] = list.get(i);
            res[1] = list.get(i+1);
          }
        }

        return res;

    }
    public boolean prime(int n){
      if(n==1){
        return false;
      }
      for(int i=2;i*i<=n;i++){
        if(n%i==0){
          return false;
        }
      }
      return true;
    }
}
