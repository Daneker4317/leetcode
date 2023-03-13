package leetcode.java;
import java.util.*;
public class ThekthFactorofn {
        public int kthFactor(int n, int k) {
        List<Integer> list =new ArrayList<>();
        for(int i=1;i*i<n;i++){
          if(n%i==0){
            list.add(i);
            list.add(n/i);
          }
        }
        if(k>list.size()){
          return -1;
        }
        return list.get(k-1);
    }
}
