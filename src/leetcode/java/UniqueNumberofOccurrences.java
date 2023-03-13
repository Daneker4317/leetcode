package leetcode.java;

import java.util.HashMap;

public class UniqueNumberofOccurrences {
      public static boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer, Integer> occurrences = new HashMap<>();
    for (int num : arr) {
     occurrences.compute(num, (k,v) -> (v==null)?1:++v);
    }
    for (int value : occurrences.values()) {
      if (occurrences.values().stream().filter(v -> v == value).count() > 1) {
        return false;
      }
    }
    return true;
  }
}
