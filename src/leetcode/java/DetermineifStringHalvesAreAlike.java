package leetcode.java;

public class DetermineifStringHalvesAreAlike {
    public boolean halvesAreAlike(String str) {
        str = str.toLowerCase();
        int c = 0;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='o' || str.charAt(i)=='e' || str.charAt(i)=='u' || str.charAt(i)=='i')c++;
        }
         for(int i=str.length()/2;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='o' || str.charAt(i)=='e' || str.charAt(i)=='u' || str.charAt(i)=='i')c--;
        }
        return c==0;
    }
}
