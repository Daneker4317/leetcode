package leetcode.java;

import java.util.LinkedList;

public class ImplementQueueUsingStacks {
    class MyQueue {

    private LinkedList<Integer> list;
    public MyQueue() {
        this.list = new LinkedList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        return list.pop();
    }

    public int peek() {
        return list.peek();
    }

    public boolean empty() {
        return list.isEmpty();
    }
}
}
