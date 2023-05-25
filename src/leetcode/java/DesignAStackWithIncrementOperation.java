package leetcode.java;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class DesignAStackWithIncrementOperation {
    class CustomStack {
        List<Integer> list;
        int current;
        int maxSize;

        public CustomStack(int maxSize) {
            this.list = new ArrayList<>();
            this.maxSize = maxSize;
            this.current = 0;
        }

        void push(int value) {
            if (current < maxSize) {
                list.add(value);
                current++;
            }
        }

        int pop() {
            if (list.isEmpty()) {
                return -1;
            }
            current--;
            return list.remove(list.size() - 1);
        }

        void increment(int k, int value) {
            int len = Math.min(k, this.list.size());
            list.subList(0, len)
                    .replaceAll(a -> a + value);
        }

    }
}
