package leetcode.java;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        for(int i=0,j=0;i<s.length();i++){
          char c  = s.charAt(i);
          if(set.contains(c)){
            while(set.contains(c)){
              set.remove(s.charAt(j++));
            }
          }
          set.add(c);
          maxLen = Math.max(maxLen , set.size());
        }
        return maxLen;
    }
}
