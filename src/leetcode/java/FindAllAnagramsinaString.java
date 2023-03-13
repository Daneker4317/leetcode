package leetcode.java;

import java.util.*;

public class FindAllAnagramsinaString {
       public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= s.length() - p.length(); i++) {
            if(isAnagram(s.substring(i , i + p.length()) , p)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int [] c = new int [26];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i) - 'a']++;
            c[t.charAt(i) - 'a' ]--;
        }
        for(int l : c){
            if(l!=0)return false;
        }
        return true;
    }
}
