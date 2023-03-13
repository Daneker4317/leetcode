package leetcode.java;

public class AddingSpacestoaString {
    public String addSpaces(String s, int[] spaces) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0 , spaces[0])).append(' ');
        for(int i= 0;i<spaces.length-1;i++){
          sb.append(s.substring(spaces[i] , spaces[i+1])).append(' ');
        }
        sb.append(s.substring(spaces[spaces.length-1]));
        return sb.toString();
    }
}
