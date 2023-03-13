package leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class OccurrencesAfterBigram {
        public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String [] str = text.split(" ");
        for(int i=0;i<str.length-2;i++){
            if(str[i].equals(first) && str[i+1].equals(second)){
              list.add(str[i+2]);
            }
        }
        System.out.print(list);
        String [] array = new String[list.size()];
        int j = 0;
        for(String st : list){
          array[j++] = st;
        }
        return array;
    }
}
