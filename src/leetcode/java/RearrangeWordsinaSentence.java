package leetcode.java;
import java.util.*;

public class RearrangeWordsinaSentence {
       public String arrangeWords(String text) {
       String[] arr = text.split(" ");
        List<String> list = Arrays.asList(arr).stream().sorted(Comparator.comparing(String::length)).toList();
        StringBuffer sb = new StringBuffer();
        sb.append(convert(list.get(0))).append(" ");
        for (int i = 1; i < list.size(); i++) {
            sb.append(list.get(i).toLowerCase()).append(" ");
        }
        return sb.toString().trim();
    }
    public static String convert(String str){
        char []  arr = str.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Character.toLowerCase(arr[i]);
        }
        arr[0] = Character.toUpperCase(arr[0]);
        return String.valueOf(arr);
    }

}
