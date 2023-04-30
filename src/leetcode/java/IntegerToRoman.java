package leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class IntegerToRoman {
    record Pair(int number, String value) {
    }

    List<Pair> pairs = new ArrayList<>() {
        {
            add(new Pair(1000, "M"));
            add(new Pair(900, "CM"));
            add(new Pair(500, "D"));
            add(new Pair(400, "CD"));
            add(new Pair(100, "C"));
            add(new Pair(90, "XC"));
            add(new Pair(50, "L"));
            add(new Pair(40, "XL"));
            add(new Pair(10, "X"));
            add(new Pair(9, "IX"));
            add(new Pair(5, "V"));
            add(new Pair(4, "IV"));
            add(new Pair(1, "I"));
        }
    };

    class Solution {
        public String intToRoman(int n) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < pairs.size(); i++) {
                while (n >= pairs.get(i).number()) {
                    n = n - pairs.get(i).number();
                    sb.append(pairs.get(i).value());
                }
            }
            return sb.toString();
        }
    }
}