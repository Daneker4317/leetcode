package leetcode.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        return Arrays
                .stream(words)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((a, b) -> !Objects.equals(b.getValue(), a.getValue()) ? (int) (b.getValue() - a.getValue()) : a.getKey()
                        .compareTo(b.getKey()))
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();
    }
}
