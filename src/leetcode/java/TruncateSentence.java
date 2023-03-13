package leetcode.java;

public class TruncateSentence {
           public static  String truncateSentence(String s, int k) {
        return s.substring(0,index(s,k));
    }
    public static int index(String s,int k){
        int c = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')c++;
            if(c==k)return i;
        }
         if(c<k) return s.length();
        return 0;
    }
}
