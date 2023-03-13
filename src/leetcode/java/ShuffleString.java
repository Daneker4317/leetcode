package leetcode.java;

public class ShuffleString {
        public String restoreString(String s, int[] indices) {
        char [] array = new char [s.length()];
        for(int i=0;i<array.length;i++){
          array[indices[i]] = s.charAt(i);
        }
        return String.valueOf(array);
    }
}
