package leetcode.java;

public class AddingSpacesToaString {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        sb.append(s, 0, spaces[0]).append(' ');
        for(int i=0; i < spaces.length-1; i++){
          sb.append(s, spaces[i], spaces[i+1]).append(' ');
        }
        sb.append(s.substring(spaces[spaces.length-1]));
        return sb.toString();
    }
}
