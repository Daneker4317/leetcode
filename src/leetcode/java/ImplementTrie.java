package leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class ImplementTrie {
    class Trie {

        private final List<String> list;

        public Trie() {
            this.list = new ArrayList<>();
        }

        public void insert(String word) {
            list.add(word);
        }

        public boolean search(String word) {
            return list.contains(word);
        }

        public boolean startsWith(String prefix) {
            return !list.isEmpty() && list.stream().anyMatch(word -> word.startsWith(prefix));
        }
    }

}
