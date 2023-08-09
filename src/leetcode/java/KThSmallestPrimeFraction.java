package leetcode.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KThSmallestPrimeFraction {
    public  static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Pair> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                double frac = (double) arr[i] / arr[j];

                heap.add(new Pair(frac, arr[i], arr[j]));

                if (heap.size() > k) {
                    System.out.println("current:" + heap);
                    heap.remove(heap.peek());
                }
            }
        }

        return new int[]{heap.peek().num1, heap.peek().num2};
    }

    record Pair(
            double frac,
            int num1,
            int num2
    ) implements Comparable<Pair> {
        @Override
        public int compareTo(Pair o) {
            if (this.frac > o.frac) {
                return 1;
            }
            return -1;
        }
    }
}
