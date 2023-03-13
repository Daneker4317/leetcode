package leetcode.java;

import java.util.*;

public class SecondLargestDigitInaString {
        public int secondHighest(String s) {
        Set<Character> set = new TreeSet<>();
        for(char c : s.toCharArray()){
          if(Character.isDigit(c)){
            set.add(c);
          }
        }
        List<Character> list = new ArrayList<>(set);
        System.out.print(list);
        return list.size() > 1 ? Character.getNumericValue(list.get(list.size() - 2)) : -1;
    }
}
