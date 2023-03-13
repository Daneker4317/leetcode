package leetcode.java;

import java.util.*;

public class GroupAnagrams {
        public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        for(String str : strs){
            String sorted = sorted(str);
            if (!map.containsKey(sorted)){
                map.put(sorted , new ArrayList<>(){{
                    add(str);
                }});
            }else map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public String sorted(String str){
        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}
