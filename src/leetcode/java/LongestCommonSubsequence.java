package leetcode.java;

public class LongestCommonSubsequence {
    static int counter = 0;
    static public int longestCommonSubsequence(String text1, String text2) {
        return sol(text1 , text2  , 0 , 0);
    }
    static public int sol(String text1, String text2 , int start  , int index){
        int firstIndex  = text1.indexOf(text2.charAt(start));
        System.out.println(text1);
        if (firstIndex < 0 || text2.length()>0){
            return counter;
        }
        return sol(text1.substring(firstIndex+1) ,text2,
                start+firstIndex , index+1);
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcde","ace"));
    }
}
