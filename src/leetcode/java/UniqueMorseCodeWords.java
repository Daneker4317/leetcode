package leetcode.java;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
        public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<String>();
        for(int i=0;i<words.length;i++){
          StringBuilder sb = new StringBuilder();
          for(char ch : words[i].toCharArray()){
            sb.append(convert(ch));
          }
          System.out.println(sb.toString());
          set.add(sb.toString());
        }
        return set.size();
    }
    public String convert(char ch){
      final String [] array = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
      final String str = "abcdefghijklmnopqrstuvwxyz";
      return array[str.indexOf(ch)];
    }
}
