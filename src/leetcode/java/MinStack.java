package leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    private final List<Integer> list;
    public MinStack() {
        this.list = new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(val);
    }
    
    public void pop() {
        list.remove(list.size() - 1);
    }
    
    public int top() {
        return list.get(list.size() - 1);
    }
    
    public int getMin() {
        return list.stream().min(Integer::compareTo).get();
    }
}