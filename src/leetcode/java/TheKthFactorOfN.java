package leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class TheKthFactorOfN {
    public int kthFactor(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i * i < n; i++) {
            if (n % i == 0) {
                list.add(i);
                list.add(n / i);
            }
        }
        if (k > list.size()) {
            return -1;
        }
        return list.get(k - 1);
    }
}
