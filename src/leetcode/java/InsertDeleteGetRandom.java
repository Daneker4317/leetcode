package leetcode.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandom {
    class RandomizedCollection {

        private Map<Integer, Integer> map;
        private Random random;

        public RandomizedCollection() {
            this.map = new HashMap<>();
            this.random = new Random();
        }

        public boolean insert(int val) {
            boolean exist = map.containsKey(val);

            if (exist){
                map.put(val, map.get(val) + 1);
            }

            return exist;
        }

        public boolean remove(int val) {
            boolean exist = map.containsKey(val);

            if (exist){
                if (map.get(val) == 1){
                    map.remove(val);
                }else {
                    map.put(val, map.get(val) - 1);
                }
            }

            return exist;
        }

        public int getRandom() {
            return new ArrayList<>(map.values())
                    .get(random.nextInt(map.values().size()));
        }
    }
}
