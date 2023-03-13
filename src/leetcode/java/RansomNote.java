package leetcode.java;

public class RansomNote {
        public boolean canConstruct(String x, String y) {
       int n = x.length();
       int m = y.length();
        int[] counter = new int[26];
        for(int i=0;i<m;i++){
            counter[y.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            if(counter[x.charAt(i)-'a']-- <=0 )
            return false;
        }
        return true;
    }
}
