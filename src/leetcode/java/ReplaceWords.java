package leetcode.java;

import java.util.List;

public class ReplaceWords {
        public static String replaceWords(List<String> dictionary, String sentence) {
       String [] curr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <curr.length; i++) {
            sb.append(pref(curr[i] , dictionary) == null ? curr[i] :  pref(curr[i] , dictionary)).append(" ");
        }
        return sb.toString().trim();
    }
    public static String pref(String str , List<String> list){
        return list.stream().filter(str::startsWith).sorted().findFirst().orElse(null);
    }
}
