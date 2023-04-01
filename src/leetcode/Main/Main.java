package leetcode.Main;


import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(0);
    }
    class FreqStack {
        private TreeMap<Integer , Integer> map = new TreeMap<>((a, b) -> b - a);
        public void push(int val) {
            if (!map.containsKey(val)){
                map.put(val , 0);
            }else {
                int tmp = map.get(val);
                map.remove(val);
                map.put(val ,tmp+1);
            }
        }

        public int pop() {
            int firstKey = map.entrySet().stream().findFirst().get().getKey();
            int toReturn = map.get(firstKey);
            map.remove(firstKey);
            return toReturn;
        }
    }
}

